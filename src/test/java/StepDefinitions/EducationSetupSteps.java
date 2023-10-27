package StepDefinitions;

import PageObjectModels.DialogContent;
import PageObjectModels.LeftNav;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EducationSetupSteps {
    DialogContent dc = new DialogContent();

    @And("The admin user sending the SubjectCategories information in Dialog")
    public void theAdminUserSendingTheSubjectCategoriesInformationInDialog(DataTable dt) {
        List<List<String>> lists = dt.asLists();

        for (int i = 0; i < lists.size(); i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element, lists.get(i).get(1));
        }
    }

    @Then("The admin user sending new  SubjectCategories information in Dialog")
    public void theAdminUserSendingNewSubjectCategoriesInformationInDialog(DataTable dt) {
        List<List<String>> lists = dt.asLists();

        for (int i = 0; i < lists.size(); i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element, lists.get(i).get(1));
        }
    }
}