package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Events {
    public static void sendKeys(WebElement element, String text) {
        BaseDriver.getWait().until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public static void click(WebElement element) {
        BaseDriver.getWait().until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript ("arguments[0].click();", element);
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void verifyContainsText(WebElement element, String value) {
        BaseDriver.getWait().until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

    }

    public static Select select(WebElement element) {
        BaseDriver.getWait().until(ExpectedConditions.elementToBeClickable(element));
        return new Select(element);
    }



}
