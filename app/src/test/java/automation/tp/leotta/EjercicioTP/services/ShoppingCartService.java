package automation.tp.leotta.EjercicioTP.services;

import automation.tp.leotta.EjercicioTP.driver.DriverActions;
import automation.tp.leotta.EjercicioTP.pages.ShoppingCartPage;

public class ShoppingCartService {
    private ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    public void goCheckout(){
        DriverActions.click(this.shoppingCartPage.getBtnCheckout());
    }
}
