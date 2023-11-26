package automation.tp.leotta.EjercicioTP.services;

import automation.tp.leotta.EjercicioTP.driver.DriverActions;
import automation.tp.leotta.EjercicioTP.pages.RadiantTeePage;

public class RadiantTeeService {
    private RadiantTeePage radiantTeePage = new RadiantTeePage();

    public void setupPurchase() {
        DriverActions.click(this.radiantTeePage.getBtnSizeL());
        DriverActions.click(this.radiantTeePage.getBtnColorBlue());
        DriverActions.setValue(this.radiantTeePage.getTxtQty(), "2");
    }

    public void addToCart() {
        DriverActions.click(this.radiantTeePage.getBtnAddToCart());
    }

    public void goToCart() {
        DriverActions.click(this.radiantTeePage.getLnkShoppingCart());
    }
}
