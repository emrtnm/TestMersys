package StepDefinitions;

import PageObjectModels.DialogContent;
import Utilities.Events;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent content = new DialogContent();

    @Given("Enter username and password")
    public void enterUsernameAndPassword() {
        Events.sendKeys(content.username, "turkeyts");
        Events.sendKeys(content.password, "TechnoStudy123");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        Events.click(content.loginButton);
    }

    @When("I should login successfully")
    public void iShouldLoginSuccessfully() {
        Events.verifyContainsText(content.homeConfirmText, "Dashboard");
    }

    @Given("Enter invalid username and password")
    public void enterInvalidUsernameAndPassword() {
        Events.sendKeys(content.username, "turkeytsa");
        Events.sendKeys(content.password, "TechnoStudy123ss");
    }

    @When("I should see the invalid message")
    public void iShouldSeeTheInvalidMessage() {
        Events.verifyContainsText(content.invalidMsg, "Invalid");
    }
}
