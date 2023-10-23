package StepDefinitions;

import PageObjectModels.DialogContent;
import PageObjectModels.LeftNav;
import Utilities.BaseDriver;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.Even;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class SchoolSetupDepartmentsSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

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

        //Events.click(dc.toggle_button);

    }

    @And("Click on the element in Dialog according to code as  {string} list for deleting")
    public void clickOnTheElementInDialogAccordingToCodeAsListForDeleting(String codeName) {

        List<WebElement> list_codes = dc.departmentCodeList;
        List<WebElement> delete_Buttons = dc.deleteBtn_List;

        for (int i = 0; i <list_codes.size() ; i++) {
            if(list_codes.get(i).getText().equalsIgnoreCase(codeName)){

                Events.click(delete_Buttons.get(i));
                Events.click(dc.actionDeleteBtn);
                //i silinecek numara

            }


        }



    }
}
