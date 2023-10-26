package StepDefinitions;
import PageObjectModels.DialogContent;
import PageObjectModels.LeftNav;
import Utilities.BaseDriver;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DocumentTypes {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Click on the stageinput element in Dialog")
    public void clickOnTheStageinputElementInDialog () {
        Events.click(dc.stage_input);
    }

    @And("User delete the element from Dialog")
    public void userDeleteTheElementFromDialog (DataTable dt) {
        new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'successfully')]")));

        List<String> list = dt.asList();

        for (int i = 0; i <list.size() ; i++) {
            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);
        }
    }


     @And("The  user add the fields information in Dialog")
    public void theUserAddTheFieldsInformationInDialog (DataTable dt) {
        List<List<String>> lists = dt.asLists();
        for (int i = 0; i < lists.size(); i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element, lists.get(i).get(1));
        }
    }
    @And("Press ESC button")
    public void pressESCButton () {
        new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }
}

