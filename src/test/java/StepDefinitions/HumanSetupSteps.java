package StepDefinitions;

import PageObjectModels.DialogContent;
import PageObjectModels.LeftNav;
import Utilities.BaseDriver;
import Utilities.Events;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HumanSetupSteps {
    DialogContent dc = new DialogContent();

    @And("The admin user sending the humanPositions information in Dialog")
    public void theAdminUserSendingTheHumanPositionsInformationInDialog(DataTable dt) {
        List<List<String>> lists = dt.asLists();
        for (int i = 0; i < lists.size(); i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            Events.sendKeys(element, lists.get(i).get(1));
        }
    }
}