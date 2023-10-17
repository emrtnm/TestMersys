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
}
