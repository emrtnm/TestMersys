package StepDefinitions;

import PageObjectModels.DialogContent;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import java.util.List;


public class SchoolSetupDepartmentsSteps {
    DialogContent dc = new DialogContent();

    @And("The admin user sending the departments information in Dialog")
    public void theAdminUserSendingTheDepartmentsInformationInDialog(DataTable dt) {
        List<List<String>> lists = dt.asLists();

        for (int i = 0; i <lists.size() ; i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element,lists.get(i).get(1));
        }
    }

    @Then("The admin user sending new departments information in Dialog")
    public void theAdminUserSendingNewDepartmentsInformationInDialog(DataTable dt) {
        List<List<String>> lists = dt.asLists();

        for (int i = 0; i < lists.size(); i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element, lists.get(i).get(1));
        }
    }

    @And("Click on the element in Dialog according to code as  {string} list for deleting")
    public void clickOnTheElementInDialogAccordingToCodeAsListForDeleting(String codeName) {
        List<WebElement> list_codes = dc.departmentCodeList;
        List<WebElement> delete_Buttons = dc.deleteBtn_List;

        for (int i = 0; i <list_codes.size() ; i++) {
            if(list_codes.get(i).getText().equalsIgnoreCase(codeName)){
                Events.click(delete_Buttons.get(i));
                Events.click(dc.actionDeleteBtn);
            }
        }
    }
}
