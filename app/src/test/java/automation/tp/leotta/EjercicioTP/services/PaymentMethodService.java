package automation.tp.leotta.EjercicioTP.services;

import automation.tp.leotta.EjercicioTP.driver.DriverActions;
import automation.tp.leotta.EjercicioTP.pages.PaymentMethodPage;

public class PaymentMethodService {
    private PaymentMethodPage paymentMethodPage = new PaymentMethodPage();

    public void checkSameAddress(){
        DriverActions.setChecked(this.paymentMethodPage.getChkSameAddress());
    }

    public void goPlaceOrder(){
        this.checkSameAddress();
        DriverActions.click(this.paymentMethodPage.getDivBAD());
        DriverActions.clickAfterWait(this.paymentMethodPage.getBtnPlaceOrder(), this.paymentMethodPage.getLoading());
    }
}
