package StepDefinitions;

import PageObjectModels.DialogContent;
import PageObjectModels.LeftNav;
import Utilities.BaseDriver;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.Even;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SchoolSetupLocationSteps extends Events {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @Given("Click on the elements in LefNav")
    public void clickOnTheElementsInLefNav(DataTable dt) {
        List<String> list = dt.asList();

        for (int i = 0; i <list.size() ; i++) {
            WebElement element = ln.getWebElement(list.get(i));
            Events.click(element);
        }
    }

    @And("Click on the elements in Dialog")
    public void clickOnTheElementsInDialog(DataTable dt) {
        List<String> list = dt.asList();

        for (int i = 0; i <list.size() ; i++) {
            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);
        }
    }

    @And("The admin user sending the informations in Dialog and choose the location type")
    public void theAdminUserSendingTheInformationsInDialogAndChooseTheLocationType(DataTable dt) {
        List<List<String>> lists = dt.asLists();

        for (int i = 0; i <lists.size() ; i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element,lists.get(i).get(1));
        }
    }

    @And("Click on the save element in Dialog")
    public void clickOnTheSaveElementInDialog(DataTable dt) {
        List<String> list = dt.asList();

        for (int i = 0; i <list.size() ; i++) {
            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);
        }
    }

    @Then("Success message should be display")
    public void successMessageShouldBeDisplay() {
        Events.verifyContainsText(dc.successMsg,"successfully");
        new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    @When("The admin click on the edit element Dialog")
    public void theAdminClickOnTheEditElementDialog() {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'successfully')]")));
        List<WebElement> edit_List= dc.editBtn;
        Events.click(edit_List.get(0));
        wait.until(ExpectedConditions.visibilityOf(dc.nameInput));
    }

    @Then("The admin user sending new locations information in Dialog")
    public void theAdminUserSendingNewLocationsInformationInDialog(DataTable dt) {
        List<List<String>> lists = dt.asLists();

        for (int i = 0; i <lists.size() ; i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element,lists.get(i).get(1));

        }
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {
        List<String> list = dt.asList();

        for (int i = 0; i <list.size() ; i++) {
            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);
        }

        new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }


    @And("Click on the element in Dialog for deleting")
    public void clickOnTheElementInDialogForDeleting(DataTable dt) {
        new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'successfully')]")));

        List<String> list = dt.asList();

        for (int i = 0; i <list.size() ; i++) {
            WebElement element = dc.getWebElement(list.get(i));
            Events.click(element);
        }
    }
}
