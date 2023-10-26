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

    @FindBy(xpath = "//ms-edit-button//button")
    public List<WebElement> editBtn;

    @FindBy(css = "table tr:last-child ms-edit-button button")
    public WebElement lastEditBtn;

    @FindBy(css = "ms-delete-button")
    public WebElement deleteBtn;

    @FindBy(css = "table tr:last-child ms-delete-button")
    public WebElement lastDelBtn;

    @FindBy(css = "ms-delete-button")
    public List<WebElement> deleteBtn_List;

    @FindBy(css = "button[type='submit']")
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

    @FindBy(css = "input[data-placeholder='Short Name']")
    public WebElement searchShortNameInput;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMsg;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='shortName']//input" )
    public WebElement ShortName;

    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExistMsg;

    @FindBy(xpath="//div[contains(text(),'Invalid')]")
    public WebElement invalidMsg;

    @FindBy(css = "input[inputmode='numeric']")
    public WebElement schoolCapacity;

    @FindBy(css = "input[data-placeholder='Short Name']")
    public WebElement schoolShortName;

    @FindBy(xpath = "//ms-save-button//button")
    public WebElement editSaveButton;

    @FindBy(css = "tbody[role*='rowgroup'] > tr > td:nth-child(3)")
    public List<WebElement> departmentCodeList;

    @FindBy (css = "ms-dialog-content input[data-placeholder='IBAN']")
    public WebElement inputIban;
    @FindBy (css =" ms-dialog-content input[data-placeholder='Integration Code']")
    public WebElement IntegrationCodeInput;
    @FindBy (css = "ms-dialog-content mat-select")
    public WebElement currency;

    @FindBy (xpath = "//mat-option/span")
    public WebElement currency1;

    @FindBy (css = "ms-text-field input[data-placeholder='Order']")
    public WebElement orderInput;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "username" : return this.username;
            case "password" : return this.password;
            case "loginButton" : return this.loginButton;
            case "addBtn" : return this.addBtn;
            case "deleteBtn" : return this.deleteBtn;
            case "actionDeleteBtn" : return this.actionDeleteBtn;
            case "searchBtn" : return this.searchBtn;
            case "saveBtn" : return this.saveBtn;
            case "nameInput" : return this.nameInput;
            case "codeInput" : return this.codeInput;
            case "searchNameInput" : return this.searchNameInput;
            case "searchCodeInput" : return this.searchCodeInput;
            case "searchShortName" : return this.searchShortNameInput;
            case "successMsg" : return this.successMsg;
            case "ShortName" : return this.ShortName;
            case "alreadyExistMsg" : return this.alreadyExistMsg;
            case "school_Capacity" : return this.schoolCapacity;
            case "school_shortName" : return this.schoolShortName;
            case "edit_saveButton" : return this.editSaveButton;
            case "inputIban" : return this.inputIban;
            case "IntegrationCodeInput" :return this.IntegrationCodeInput;
            case "currency" : return this.currency;
            case "currency1" : return this.currency1;
            case "orderInput": return this.orderInput;
            case "lastDeleteBtn": return this.lastDelBtn;
            default: return null;
        }
    }
}
