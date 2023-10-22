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

    @FindBy(xpath = "//*[text()='Positions']")
    public WebElement positions;

    @FindBy(xpath = "//*[text()='Attestations']")
    public WebElement attestations;

    @FindBy(xpath = "//*[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "//*[text()='School Setup']")
    public WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    public WebElement schoolSetup_Locations;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement schoolSetup_Departments;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "setup" : return this.setup;
            case "humanResources" : return this.humanResources;
            case "dropSetup" : return this.dropSetup;
            case "education" : return this.education;
            case "positions" : return this.positions;
            case "attestations" : return this.attestations;
            case "parameters" : return this.parameters;
            case "schoolSetup" : return this.schoolSetup;
            case "schoolSetup_Locations" : return this.schoolSetup_Locations;
            case "schoolSetup_Departments" : return this.schoolSetup_Departments;
            default: return null;
        }
    }
}

