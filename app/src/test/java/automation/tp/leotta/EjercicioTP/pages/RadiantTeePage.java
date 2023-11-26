package automation.tp.leotta.EjercicioTP.pages;

import org.openqa.selenium.By;

public class RadiantTeePage {
    private By btnSizeL = By.id("option-label-size-143-item-169");
    private By btnColorBlue = By.cssSelector("div[option-label=\"Blue\"]");
    private By txtQty = By.name("qty");
    private By btnAddToCart = By.xpath("//button[@title=\"Add to Cart\"]");
    private By lnkShoppingCart = By.linkText("shopping cart");

    public By getBtnSizeL() {
        return btnSizeL;
    }

    public By getBtnColorBlue() {
        return btnColorBlue;
    }

    public By getTxtQty() {
        return txtQty;
    }

    public By getBtnAddToCart() {
        return btnAddToCart;
    }

    public By getLnkShoppingCart() {
        return lnkShoppingCart;
    }
}