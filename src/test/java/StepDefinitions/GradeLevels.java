package StepDefinitions;

import PageObjectModels.DialogContent;
import Utilities.Events;
import io.cucumber.java.en.And;

public class GradeLevels {
    DialogContent content = new DialogContent();

    @And("Enter shortname {string} and {string}")
    public void enterShortnameAndAnd(String shortname, String order) {
        Events.sendKeys(content.ShortName, shortname);
        Events.sendKeys(content.orderInput, order);
    }

    @And("Click on the last edit button")
    public void clickOnTheLastEditButton() throws InterruptedException {
        Thread.sleep(500);
        Events.click(content.lastEditBtn);
    }

    @And("Enter shortname {string} for update")
    public void enterShortnameForUpdate(String shortname) {
        Events.sendKeys(content.ShortName, shortname);
    }
}
