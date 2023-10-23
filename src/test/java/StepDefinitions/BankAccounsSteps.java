package StepDefinitions;

import PageObjectModels.DialogContent;
import PageObjectModels.LeftNav;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BankAccounsSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    @And("The admin click on the edit element Dialog sends the keys into the DialogBox")
    public void theAdminClickOnTheEditElementDialogSendsTheKeysIntoTheDialogBox(DataTable dt) {
        List<List<String>> lists = dt.asLists();

        for (int i = 0; i <lists.size() ; i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element,lists.get(i).get(1));
        }
    }

    @And("Click on the element in DialogBox")
    public void clickOnTheElementInDialogBox(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strButtonsList.get(i));
            Events.click(linkWebElement);
        }
    }
}
