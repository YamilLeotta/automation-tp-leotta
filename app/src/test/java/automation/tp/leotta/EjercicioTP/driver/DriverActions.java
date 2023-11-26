package automation.tp.leotta.EjercicioTP.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DriverActions {
    public static void click(By element){
        DriverManager.getWait().until(
            ExpectedConditions.and(
                ExpectedConditions.presenceOfElementLocated(element),
                ExpectedConditions.visibilityOfElementLocated(element),
                ExpectedConditions.elementToBeClickable(element)
            )
        );

        DriverManager.getDriver().findElement(element).click();
    }

    public static void setValue(By element, String text){
        DriverManager.getWait().until(
            ExpectedConditions.and(
                    ExpectedConditions.presenceOfElementLocated(element),
                    ExpectedConditions.visibilityOfElementLocated(element)
            )
        );

        DriverManager.getDriver().findElement(element).clear();
        DriverManager.getDriver().findElement(element).sendKeys(text);
    }

    public static String getText(By element) {
        DriverManager.getWait().until(
            ExpectedConditions.and(
                    ExpectedConditions.presenceOfElementLocated(element),
                    ExpectedConditions.visibilityOfElementLocated(element)
            )
        );

        return DriverManager.getDriver().findElement(element).getText();
    }

    public static Boolean isVisible(By element) {
        return DriverManager.getWait().until(
            ExpectedConditions.and(
                    ExpectedConditions.presenceOfElementLocated(element),
                    ExpectedConditions.visibilityOfElementLocated(element)
            )
        );
    }

    public static Boolean isEnabled(By element) {
        return DriverManager.getWait().until(
            ExpectedConditions.and(
                ExpectedConditions.presenceOfElementLocated(element),
                ExpectedConditions.visibilityOfElementLocated(element),
                ExpectedConditions.elementToBeClickable(element)
            )
        );
    }

    public static void setSelect(By element, String selectText){
        DriverManager.getWait().until(
            ExpectedConditions.and(
                    ExpectedConditions.presenceOfElementLocated(element),
                    ExpectedConditions.visibilityOfElementLocated(element)
            )
        );

        new Select(DriverManager.getDriver().findElement(element)).selectByVisibleText(selectText);
    }

    public static void setChecked(By element) {
        DriverManager.getWait().until(
            ExpectedConditions.and(
                ExpectedConditions.presenceOfElementLocated(element),
                ExpectedConditions.visibilityOfElementLocated(element),
                ExpectedConditions.elementToBeClickable(element)
            )
        );

        if (!DriverManager.getDriver().findElement(element).isSelected()) DriverManager.getDriver().findElement(element).click();
    }

    public static void clickAfterWait(By element, By elementToWait) {
        DriverManager.getWait().until(
            ExpectedConditions.and(
                ExpectedConditions.presenceOfElementLocated(element),
                ExpectedConditions.visibilityOfElementLocated(element),
                ExpectedConditions.elementToBeClickable(element),
                ExpectedConditions.invisibilityOfElementLocated(elementToWait)
            )
        );

        DriverManager.getDriver().findElement(element).click();
    }
}