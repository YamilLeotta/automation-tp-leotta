package automation.tp.leotta.EjercicioTP.pages;

import org.openqa.selenium.By;

public class HomePage {
    private By lnkRadiantTee = By.partialLinkText("Radiant Tee");

    public By getLnkRadiantTee() {
        return this.lnkRadiantTee;
    }
}
