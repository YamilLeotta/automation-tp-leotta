package automation.tp.leotta.EjercicioTP.pages;

import org.openqa.selenium.By;

public class CheckoutPage {
    private By txtEmail = By.id("customer-email");
    private By txtFirstName = By.name("firstname");
    private By txtLastName = By.name("lastname");
    private By txtCompany = By.name("company");
    private By txtAddress = By.name("street[0]");
    private By txtCity = By.name("city");
    private By txtState = By.name("region");
    private By txtZip = By.name("postcode");
    private By selCountry = By.name("country_id");
    private By txtPhone = By.name("telephone");
    private By optShipping = By.xpath("//input[@value='flatrate_flatrate']");
    private By btnNext = By.cssSelector("button[data-role=\"opc-continue\"]");
    
    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtCompany() {
        return txtCompany;
    }

    public By getTxtAddress() {
        return txtAddress;
    }

    public By getTxtCity() {
        return txtCity;
    }

    public By getTxtState() {
        return txtState;
    }

    public By getTxtZip() {
        return txtZip;
    }

    public By getSelCountry() {
        return selCountry;
    }

    public By getTxtPhone() {
        return txtPhone;
    }

    public By getOptShipping() {
        return optShipping;
    }

    public By getBtnNext() {
        return btnNext;
    }
}