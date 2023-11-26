package automation.tp.leotta.EjercicioTP;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.tp.leotta.EjercicioTP.driver.DriverManager;
import automation.tp.leotta.EjercicioTP.services.CheckoutService;
import automation.tp.leotta.EjercicioTP.services.HomeService;
import automation.tp.leotta.EjercicioTP.services.OrderConfirmService;
import automation.tp.leotta.EjercicioTP.services.PaymentMethodService;
import automation.tp.leotta.EjercicioTP.services.RadiantTeeService;
import automation.tp.leotta.EjercicioTP.services.ShoppingCartService;

public class EjercicioTP {

        @BeforeClass
        public void setup(){
                DriverManager.create("chrome");
                DriverManager.goSite("https://magento.softwaretestingboard.com/");
        }

        @Test
        public void pasos(){
                HomeService homeService = new HomeService();
                RadiantTeeService radiantTeeService = new RadiantTeeService();
                ShoppingCartService shoppingCartService = new ShoppingCartService();
                CheckoutService checkoutService = new CheckoutService();
                PaymentMethodService paymentMethodService = new PaymentMethodService();

                homeService.selectRadiantTee();

                radiantTeeService.setupPurchase();
                radiantTeeService.addToCart();
                radiantTeeService.goToCart();

                shoppingCartService.goCheckout();

                checkoutService.completeShippingAdressSection();
                checkoutService.completeShippingMethodsSection();
                checkoutService.goNext();

                paymentMethodService.goPlaceOrder();
        }

        @Test
        public void validaciones() throws InterruptedException {
                OrderConfirmService orderConfirmService = new OrderConfirmService();

                // El título es igual a “Thank you for purchase!”
                Assert.assertEquals(
                        orderConfirmService.getConfirmText(),
                        "Thank you for purchase!",
                        "El título de confirmación no es el esperado."
                );

                // El botón “Continue Shopping” está habilitado.
                Assert.assertTrue(
                        orderConfirmService.getContinueEnabled(),
                        "No se encontró el botón \"Continue Shopping\" habilitado"
                );

                // El botón “Create an Account” está visible
                Assert.assertTrue(
                        orderConfirmService.isCreateVisible(),
                        "No se encontró el botón \"Create an Account\" visible"
                );

                /* El número de la orden (Your order # is:) es un número (en la captura de
                ejemplo es el 000026889). Pista, mediante el método split() de la clase
                String, podrá separar todo el texto en palabras. */
                Assert.assertTrue(
                        orderConfirmService.getOrderId().matches ("\\d+"),
                        "El \"número\" de la orden no es un número"
                );
        }
}
