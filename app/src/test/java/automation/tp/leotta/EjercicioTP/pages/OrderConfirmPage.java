package automation.tp.leotta.EjercicioTP.pages;

import org.openqa.selenium.By;

public class OrderConfirmPage {
    private By lblConfirm = By.xpath("//h1/span[text()=\"Thank you for your purchase!\"]");
    private By btnContinue = By.xpath("//div[@class=\"actions-toolbar\"]//a[descendant::span[text()=\"Continue Shopping\"]]");
    private By btnCreate = By.xpath("//span[text()=\"Create an Account\"]");
    private By lblOrderId = By.xpath("//p[text()=\"Your order # is: \"]/span");
    
    public By getLblConfirm() {
        return this.lblConfirm;
    }

    public By getBtnContinue() {
        return this.btnContinue;
    }

    public By getBtnCreate() {
        return this.btnCreate;
    }

    public By getLblOrderId() {
        return this.lblOrderId;
    }
}
