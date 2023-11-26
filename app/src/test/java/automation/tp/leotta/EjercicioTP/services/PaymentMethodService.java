package automation.tp.leotta.EjercicioTP.services;

import automation.tp.leotta.EjercicioTP.driver.DriverActions;
import automation.tp.leotta.EjercicioTP.pages.PaymentMethodPage;

public class PaymentMethodService {
    private PaymentMethodPage paymentMethodPage = new PaymentMethodPage();

    public void goPlaceOrder(){
        DriverActions.click(this.paymentMethodPage.getBtnPlaceOrder());
    }
}
