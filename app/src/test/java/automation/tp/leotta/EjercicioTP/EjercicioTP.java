package automation.tp.leotta.EjercicioTP;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.tp.leotta.EjercicioTP.driver.DriverManager;
import automation.tp.leotta.EjercicioTP.services.CheckoutService;
import automation.tp.leotta.EjercicioTP.services.HomeService;
import automation.tp.leotta.EjercicioTP.services.PaymentMethodService;
import automation.tp.leotta.EjercicioTP.services.RadiantTeeService;
import automation.tp.leotta.EjercicioTP.services.ShoppingCartService;

public class EjercicioTP {

    @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void compraCorrecta() {
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




/*
        InventoryService inventoryService = new InventoryService();
        inventoryService.clickAddToCardSauceLabsBackPack();
        inventoryService.goCart();

        CartService cartService = new CartService();
        cartService.goCheckout();

        CheckoutStepOneService checkoutStepOneService = new CheckoutStepOneService();
        checkoutStepOneService.completedForm("Nelson", "Campos", "5000");
        checkoutStepOneService.stepOnecontinue();

        CheckoutStepTwoService checkoutStepTwoService = new CheckoutStepTwoService();
        checkoutStepTwoService.goFinish();

        CheckoutCompleteService checkoutCompleteService = new CheckoutCompleteService();
        //checkoutCompleteService.goBackHome();

        //El mensaje contiene la frase order has been dispatched
        Assert.assertTrue(
                checkoutCompleteService.getCompleteText().contains("order has been dispatched"),
                "El Complete Text no contiene el texto order has been dispatched"
        );
        //El titulo Checkout: Complete! esta visible.
        Assert.assertTrue(
                checkoutCompleteService.isVisibleTitle(),
                "El Title no es visible"
        );
        //El boton Back Home esta habilitado.
        Assert.assertTrue(
                checkoutCompleteService.isEnableBackHome(),
                "El Back Home no esta habilitado"
        );

/*
        Validaciones:
        - El carrito no contiene elementos.
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

 */
    }
}
