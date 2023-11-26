package automation.tp.leotta.EjercicioTP.services;

import automation.tp.leotta.EjercicioTP.driver.DriverActions;
import automation.tp.leotta.EjercicioTP.pages.OrderConfirmPage;

public class OrderConfirmService {
    private OrderConfirmPage orderConfirmPage = new OrderConfirmPage();

    public String getConfirmText(){
        return DriverActions.getText(this.orderConfirmPage.getLblConfirm());
    }

    public Boolean getContinueEnabled(){
        return DriverActions.isEnabled(this.orderConfirmPage.getBtnContinue());
    }

    public Boolean isCreateVisible(){
        return DriverActions.isVisible(this.orderConfirmPage.getBtnCreate());
    }

    public String getOrderId(){
        return DriverActions.getText(this.orderConfirmPage.getLblOrderId());
    }
}