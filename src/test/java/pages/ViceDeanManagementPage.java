package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagementPage {

    public ViceDeanManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramButton;


    //sikintili
    @FindBy(xpath = "(//*[text()='Vice Dean Management'])[2]")
    public WebElement ViceDeanManagementBaslik;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement message;


    @FindBy(id = "name")
    public WebElement name;
    @FindBy(id = "surname")
    public WebElement surname;
    @FindBy(id = "birthPlace")
    public WebElement birthPlace;
    @FindBy(xpath = "//*[@value='FEMALE']")
    public WebElement genderFemale;
    @FindBy(xpath = "//*[@value='MALE']")
    public WebElement genderMale;
    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;
    @FindBy(id = "ssn")
    public WebElement ssn;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;



    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement nameRequired;



    @FindBy(xpath = "(//*[@class='page-link'])[5]")
    public WebElement sonSayfaGecisButonu;






    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td[3]")
    public WebElement phoneNumberTableKullanilanNumara;




    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td[5]")
    public WebElement usernameTableKullanilanNumara;

    @FindBy(xpath = "(//*[@class='card-body'])[2]")
    public WebElement viceDeanListIlkSayfaTablo;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement passwordRequired;



    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td[4]")
    public WebElement ssnTableKullanilanNumara;




}