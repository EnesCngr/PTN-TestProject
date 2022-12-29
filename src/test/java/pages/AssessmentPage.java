package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AssessmentPage {

    public AssessmentPage() {
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//div[text()=' Event Manager Login ']")
    public WebElement loginText;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//mat-error[text()='Username field is required']")
    public WebElement usernameError;

    @FindBy(xpath = "//mat-error[text()='Password field is required']")
    public WebElement passwordError;

    @FindBy(xpath = "//strong[text()='Welcome Automation Test User']")
    public WebElement dashbordText;

    @FindBy(xpath = "//span[text()='Create Event']")
    public WebElement createEventButton;

    @FindBy(xpath = "//span[text()='Create New Event']")
    public WebElement createNewEventButton;

    @FindBy(xpath = "//mat-error[text()='Event name field is required']")
    public WebElement EventNameError;

    @FindBy(xpath = "//mat-error[text()='Please choose a valid date']")
    public WebElement EventDateError;

    @FindBy(xpath = "//mat-error[text()='Participant name is required']")
    public WebElement NameError;

    @FindBy(xpath = "//mat-error[text()='Participant last name is required']")
    public WebElement LastNameError;

    @FindBy(xpath = "//mat-error[text()='Please enter email or phone number']")
    public WebElement emailError;

    @FindBy(xpath = "//span[text()='Add Participant']")
    public WebElement AddParticipantButton;

    @FindBy(xpath = "//input[@data-placeholder='Enter event name']")
    public WebElement EventNameBox;

    @FindBy(xpath = "//input[@data-placeholder='Enter event description']")
    public WebElement DescriptionBox;

    @FindBy(xpath = "//input[@id='mat-input-13']")
    public WebElement EventDateBox;

    @FindBy(xpath = "//input[@data-placeholder='Enter first name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@data-placeholder='Enter last name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@data-placeholder='Enter email or phone']")
    public WebElement contactBox;

    @FindBy(xpath = "//td[@class='mat-cell cdk-cell cdk-column-id mat-column-id ng-star-inserted']")
    public WebElement firstEvent;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-icon-button mat-button-base']")
    public WebElement calenderButton;

    @FindBy(xpath = "//td[@aria-label='21 December 2022']")
    public WebElement calenderDate;


    @FindBy(xpath = "(//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'])[2]")
    public WebElement EventDeleteButton;

    @FindBy(xpath = "(//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color'])[3]")
    public WebElement ParticipantsButton;

    @FindBy(xpath = "//mat-card-content[@class='mat-card-content']")
    public WebElement eventBulunamadiText;

    @FindBy(xpath = "//button[@title='Edit Event']")
    public WebElement EventEditButton;

    @FindBy(xpath = "//span[text()='Update Event']")
    public WebElement updateEventButton;

    @FindBy(xpath = "//span[text()='Events']")
    public WebElement eventsSayfasi;

    @FindBy(xpath = "//h1[text()='Edit Event: #1']")
    public WebElement editSayfasi;

    @FindBy(xpath = "//table[@class='participant-table']")
    public WebElement participantsTable;




    public void bekle(int saniye){
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
