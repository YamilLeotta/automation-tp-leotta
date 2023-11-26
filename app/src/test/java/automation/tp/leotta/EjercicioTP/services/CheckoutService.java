package automation.tp.leotta.EjercicioTP.services;

import automation.tp.leotta.EjercicioTP.driver.DriverActions;
import automation.tp.leotta.EjercicioTP.pages.CheckoutPage;

public class CheckoutService {
    private CheckoutPage checkoutPage = new CheckoutPage();

    public void completeShippingAdressSection() {
        DriverActions.setSelect(this.checkoutPage.getSelCountry(), "Argentina");
        DriverActions.setValue(this.checkoutPage.getTxtEmail(), "simpson.homero@snp.com");
        DriverActions.setValue(this.checkoutPage.getTxtFirstName(), "Homero");
        DriverActions.setValue(this.checkoutPage.getTxtLastName(), "Simpson");
        DriverActions.setValue(this.checkoutPage.getTxtCompany(), "Planta nuclear de Springfield");
        DriverActions.setValue(this.checkoutPage.getTxtAddress(), "Av. Siempreviva 742");
        DriverActions.setValue(this.checkoutPage.getTxtCity(), "Springfield");
        DriverActions.setValue(this.checkoutPage.getTxtState(), "Entre Rios");
        DriverActions.setValue(this.checkoutPage.getTxtZip(), "1234");
        DriverActions.setValue(this.checkoutPage.getTxtPhone(), "1234567890");
    }

    public void completeShippingMethodsSection() {
        DriverActions.click(this.checkoutPage.getOptShipping());
    }

    public void goNext() {
        DriverActions.click(this.checkoutPage.getBtnNext());
    }
}
