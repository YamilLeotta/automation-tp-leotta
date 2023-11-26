package automation.tp.leotta.EjercicioTP.pages;

import org.openqa.selenium.By;

public class ShoppingCartPage {
    private By btnCheckout = By.xpath("//button[@data-role='proceed-to-checkout']");

    public By getBtnCheckout() {
        return btnCheckout;
    }
}