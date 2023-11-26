package automation.tp.leotta.EjercicioTP.pages;

import org.openqa.selenium.By;

public class PaymentMethodPage {
    private By chkSameAddress = By.name("billing-address-same-as-shipping");
    private By btnPlaceOrder = By.xpath("//button[@title=\"Place Order\"]");
    private By loading = By.className("_block-content-loading");
    private By divBAD = By.className("billing-address-details");

    public By getBtnPlaceOrder() {
        return this.btnPlaceOrder;
    }

    public By getChkSameAddress() {
        return this.chkSameAddress;
    }

    public By getLoading() {
        return this.loading;
    }

    public By getDivBAD() {
        return this.divBAD;
    }
}
