package automation.tp.leotta.EjercicioTP.services;

import automation.tp.leotta.EjercicioTP.driver.DriverActions;
import automation.tp.leotta.EjercicioTP.pages.HomePage;

public class HomeService {
    private HomePage homePage = new HomePage();

    public void selectRadiantTee(){
        DriverActions.click(this.homePage.getLnkRadiantTee());
    }
}
