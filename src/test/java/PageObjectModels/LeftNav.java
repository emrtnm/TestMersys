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

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    public WebElement bank_Accounts;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;

    @FindBy(xpath = "//span[text()='Document Types']")
    public WebElement document_types;

    @FindBy(xpath = "//span[text()='Fields']")
    public WebElement fields;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement educationSetup;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement humanSetup;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    public WebElement  SubjectCategories;

    @FindBy(xpath = "//span[text()='Position Categories']")
    public WebElement  positionCategories;

    @FindBy(xpath = "//span[text()='Discounts']")
    public WebElement  discounts;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "setup"                    : return this.setup;
            case "humanResources"           : return this.humanResources;
            case "dropSetup"                : return this.dropSetup;
            case "education"                : return this.education;
            case "positions"                : return this.positions;
            case "attestations"             : return this.attestations;
            case "parameters"               : return this.parameters;
            case "schoolSetup"              : return this.schoolSetup;
            case "schoolSetup_Locations"    : return this.schoolSetup_Locations;
            case "schoolSetup_Departments"  : return this.schoolSetup_Departments;
            case "bank_Accounts"            : return  this.bank_Accounts;
            case "gradeLevels"              : return  this.gradeLevels;
            case "documentType"             : return  this.document_types;
            case "fields"                   : return  this.fields;
            case "educationSetup"           : return this.educationSetup;
            case "SubjectCategories"        : return this.SubjectCategories;
            case "positionCategories"       : return this.positionCategories;
            case "humanSetup"               : return this.humanSetup;
            case "discounts"                : return this.discounts;
            default                         : return null;
        }
    }
}

