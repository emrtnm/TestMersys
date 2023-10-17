package PageObjectModels;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav {
    public LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "(//span[text()='Human Resources'])[1]")
    public WebElement humanResources;

    @FindBy(xpath = "//fuse-nav-vertical-collapsable[contains(@class,'open')]//span[text()='Setup']")
    public WebElement dropSetup;

    @FindBy(xpath = "(//span[text()='Education'])[1]")
    public WebElement education;

    @FindBy(xpath = "//*[text()='Attestations']")
    public WebElement attestations;

    @FindBy(xpath = "//*[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "//*[text()='School Setup']")
    public WebElement schoolSetup;
}
