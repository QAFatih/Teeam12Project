package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanManagementPage {

    public DeanManagementPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;


    @FindBy(xpath = "//*[@id='name']")
    public WebElement deanName ;
    @FindBy (xpath = "//*[@id='surname']")
    public WebElement deanSurname ;
    @FindBy (xpath = "//*[@id='birthPlace']")
    public WebElement deanBirthPlace ;
    @FindBy (xpath = "//*[@id='birthDay']")
    public WebElement deanBirthDay ;

    @FindBy (xpath = "//*[@value='FEMALE']")
    public WebElement deanFemaleButton ;
    @FindBy (xpath = "//*[@value='MALE']")
    public WebElement deanMaleButton ;
    @FindBy (xpath = "//*[@id='phoneNumber']")
    public WebElement deanPhoneNumber ;
    @FindBy (xpath = "//*[@id='ssn']")
    public WebElement deanSsn ;
    @FindBy (xpath = "//*[@id='username']")
    public WebElement deanAdminUsername ;
    @FindBy (xpath = "//*[@id='password']")
    public WebElement deanAdminPassword ;
    @FindBy (xpath = "//*[text()='Submit']")
    public WebElement deanSubmitButton;

    @FindBy (xpath = "(//td['span'])[7]")
    public WebElement deanNameSurname ;

    @FindBy (xpath = "(//td['span'])[8]")
    public WebElement deanGender;

    @FindBy (xpath = "(//td['span'])[9]")
    public WebElement deanPhoneNumberAssert;

    @FindBy (xpath = "(//td['span'])[10]")
    public WebElement deanSsnAssert;

    @FindBy (xpath = "(//td['span'])[11]")
    public WebElement deanUserNameAssert;

    @FindBy (xpath = "(//td['span'])[12]")
    public WebElement deanGenderAssert;
    @FindBy (xpath = "(//*[@class='text-dark btn btn-outline-info'])[1]")
    public WebElement deanEditButton ;



}
