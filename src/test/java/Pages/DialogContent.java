package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends MyMethods {
    public DialogContent() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//span[contains(text(),'LOGIN')]")
    private WebElement loginBtn;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesBtn;

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement addCountry;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement countryName;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement countryNameSearch;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement countryCode;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]")
    private WebElement countryCodeSearch;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenshipBtn;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement citizenshipName;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private WebElement citizenshipShortName;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement citizenshipNameSearch;

    @FindBy(xpath = "//span[text()='States'")
    private WebElement statesBtn;

    @FindBy(xpath = "//tbody[@role='rowgroup']//td[2]")
    private List<WebElement> statesList;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypesBtn;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[1]")
    private WebElement citizenshipShortNameSearch;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement countrySaveBtn;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement citizenshipSaveBtn;

    @FindBy(css = "ms-delete-button")
    private WebElement deleteCountry;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteCountry;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement countrySearchBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    private WebElement dashBoardHeader;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Document Types')]")
    private WebElement documentTypesHeader;

    @FindBy(xpath = "/html[1]/body[1]/app[1]/vertical-layout-1[1]/div[1]/div[1]/div[1]/div[1]/content[1]/document-types[1]/ms-browse[1]/div[1]/ms-browse-table[1]/div[1]/ms-table[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/thead[1]/tr[1]/th[7]/ms-table-toolbar[1]/div[1]/ms-add-button[1]/div[1]/button[1]/span[1]/fa-icon[1]/*[name()='svg'][1]")
    private WebElement addDocument;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement documentName;

    @FindBy(xpath = "(//span[contains(@class, 'mat-select-placeholder')])[2]")
    private WebElement documentStageDropDown;

    @FindBy(css = "textarea[formcontrolname='description']")
    private WebElement documentDescriptionField;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement documentSaveBtn;

    @FindBy(className = "mat-option-text")
    private List<WebElement> documentStages;

    @FindBy(xpath = "(//span//input[@role=\"switch\"])[31]")
    private WebElement requiredToggle;

    @FindBy(xpath = "(//span//input[@role=\"switch\"])[32]")
    private WebElement activeToggle;

    @FindBy(xpath = "(//span//input[@role=\"switch\"])[33]")
    private WebElement cameraToggle;

    @FindBy(css = "[class=\"mat-slide-toggle-bar\"]")
    private List<WebElement> allToggles;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement documentSearchField;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement documentSearchButton;

    @FindBy(xpath = "/html[1]/body[1]/app[1]/vertical-layout-1[1]/div[1]/div[1]/div[1]/div[1]/content[1]/document-types[1]/ms-browse[1]/div[1]/ms-browse-table[1]/div[1]/ms-table[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/ms-edit-button[1]/button[1]/span[1]/fa-icon[1]/*[name()='svg'][1]")
    private WebElement editIcon;

    @FindBy(xpath = "/html[1]/body[1]/app[1]/vertical-layout-1[1]/div[1]/div[1]/div[1]/div[1]/content[1]/document-types[1]/ms-browse[1]/div[1]/ms-browse-table[1]/div[1]/ms-table[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/ms-delete-button[1]/button[1]/span[1]/fa-icon[1]/*[name()='svg'][1]/*[name()='path'][1]")
    private WebElement deleteIcon;

    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']")
    private WebElement documentStageEditDropdown;

    @FindBy(xpath = "//span[normalize-space()='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[contains(text(),'There is no data to display')]")
    private WebElement noResultsMessage;

    @FindBy (xpath = "//mat-error[@id='mat-error-2']")
    private WebElement documentAddErrorMessage;

    public List<WebElement> getStatesList() {
        return statesList;
    }

    public WebElement getStatesBtn() {
        return statesBtn;
    }

    public WebElement getCitizenshipNameSearch() {
        return citizenshipNameSearch;
    }

    public WebElement getCitizenshipShortNameSearch() {
        return citizenshipShortNameSearch;
    }

    public WebElement getCitizenshipBtn() {
        return citizenshipBtn;
    }

    public WebElement getAddCountry() {
        return addCountry;
    }

    public WebElement getCountryName() {
        return countryName;
    }

    public WebElement getCountryCode() {
        return countryCode;
    }

    public WebElement getCountrySaveBtn() {
        return countrySaveBtn;
    }

    public WebElement getCitizenshipName() {
        return citizenshipName;
    }

    public WebElement getCitizenshipShortName() {
        return citizenshipShortName;
    }

    public WebElement getCitizenshipSaveBtn() {
        return citizenshipSaveBtn;
    }

    public WebElement getConfirmDeleteCountry() {
        return confirmDeleteCountry;
    }

    public WebElement getDeleteCountry() {
        return deleteCountry;
    }

    public WebElement getCountryNameSearch() {
        return countryNameSearch;
    }

    public WebElement getCountryCodeSearch() {
        return countryCodeSearch;
    }

    public WebElement getCountrySearchBtn() {
        return countrySearchBtn;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getParameterBtn() {
        return parameterBtn;
    }

    public WebElement getCountriesBtn() {
        return countriesBtn;
    }

    public WebElement getDashBoardHeader() {
        return dashBoardHeader;
    }

    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getDocumentTypesBtn() {
        return documentTypesBtn;
    }

    public WebElement getDocumentTypesHeader() {
        return documentTypesHeader;
    }

    public WebElement getAddDocument() {
        return addDocument;
    }

    public WebElement getDocumentName() {
        return documentName;
    }

    public WebElement getDocumentStageDropDown() {
        return documentStageDropDown;
    }

    public WebElement getDocumentDescriptionField() {
        return documentDescriptionField;
    }

    public WebElement getDocumentSaveBtn() {
        return documentSaveBtn;
    }

    public List<WebElement> getDocumentStages() {
        return documentStages;
    }

    public WebElement getRequiredToggle() {
        return requiredToggle;
    }

    public WebElement getActiveToggle() {
        return activeToggle;
    }

    public WebElement getCameraToggle() {
        return cameraToggle;
    }

    public List<WebElement> getAllToggles() {
        return allToggles;
    }

    public WebElement getDocumentSearchField() {
        return documentSearchField;
    }

    public WebElement getDocumentSearchButton() {
        return documentSearchButton;
    }

    public WebElement getEditIcon() {
        return editIcon;
    }

    public WebElement getDeleteIcon() {
        return deleteIcon;
    }

    public WebElement getDocumentStageEditDropdown() {
        return documentStageEditDropdown;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getNoResultsMessage() {
        return noResultsMessage;
    }

    public WebElement getDocumentAddErrorMessage() {
        return documentAddErrorMessage;
    }
}
