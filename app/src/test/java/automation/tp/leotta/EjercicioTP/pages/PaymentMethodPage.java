package automation.tp.leotta.EjercicioTP.pages;

import org.openqa.selenium.By;

public class PaymentMethodPage {
    private By btnPlaceOrder = By.className("billing-address-details");

    public By getBtnPlaceOrder() {
        return this.btnPlaceOrder;
    }
}
