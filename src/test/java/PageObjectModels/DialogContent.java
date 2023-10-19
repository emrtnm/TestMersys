package PageObjectModels;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent {
    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()=' Dashboard ']")
    public WebElement homeConfirmText;

    @FindBy(css = "ms-add-button")
    public WebElement addBtn;

    @FindBy(css = "ms-edit-button")
    public WebElement editBtn;

    @FindBy(css = "ms-delete-button")
    public WebElement deleteBtn;

    @FindBy(css = "mat-dialog-actions button[type='submit']")
    public WebElement actionDeleteBtn;

    @FindBy(css = "ms-search-button")
    public WebElement searchBtn;

    @FindBy(css = "ms-save-button")
    public WebElement saveBtn;

    @FindBy(css = "ms-dialog-content input[data-placeholder='Name']")
    public WebElement nameInput;

    @FindBy(css = "ms-dialog-content input[data-placeholder='Code']")
    public WebElement codeInput;

    @FindBy(css = "input[data-placeholder='Name']")
    public WebElement searchNameInput;

    @FindBy(css = "input[data-placeholder='Code']")
    public WebElement searchCodeInput;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMsg;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='shortName']//input" )
    public WebElement ShortName;

    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExistMsg;

    @FindBy(css = "span[class*='mat-option-text']")
    public List<WebElement> school_LocationType;

    @FindBy(css = "input[inputmode='numeric']")
    public WebElement school_Capacity;

    @FindBy(css = "input[data-placeholder='Short Name']")
    public WebElement school_shortName;


    public WebElement getWebElement(String strElement){

        switch (strElement){

            case "username" : return this.username;
            case "password" : return this.password;
            case "loginButton" : return this.loginButton;
            case "addBtn" : return this.addBtn;
            case "editBtn" : return this.editBtn;
            case "deleteBtn" : return this.deleteBtn;
            case "actionDeleteBtn" : return this.actionDeleteBtn;
            case "searchBtn" : return this.searchBtn;
            case "saveBtn" : return this.saveBtn;
            case "nameInput" : return this.nameInput;
            case "codeInput" : return this.codeInput;
            case "searchNameInput" : return this.searchNameInput;
            case "searchCodeInput" : return this.searchCodeInput;
            case "successMsg" : return this.successMsg;
            case "ShortName" : return this.ShortName;
            case "alreadyExistMsg" : return this.alreadyExistMsg;
            case "school_Capacity" : return this.school_Capacity;
            case "school_shortName" : return this.school_shortName;

        }
        return null;
    }
}
