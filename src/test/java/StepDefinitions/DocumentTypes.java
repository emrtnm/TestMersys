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

    @And("Click on the stageinput element in Dialog")
    public void clickOnTheStageinputElementInDialog () {
        Events.click(dc.stage_input);
    }

    @And("Press ESC button")
    public void pressESCButton () {
        new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }
}

