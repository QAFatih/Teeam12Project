package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {

    public TeacherManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//*[text()='Teacher Management']")
    public WebElement teacherButton;

    @FindBy(xpath = "//*[text()='Teacher List']")
    public WebElement teacherList;



    @FindBy(xpath = "(//*[@role=\"button\"])[13]")
    public WebElement teachersayfatiklama;

    @FindBy(xpath = "(//*[@type=\"button\"])[8]")
    public WebElement temeledit;

    @FindBy(xpath = "(//*[@aria-hidden=\"true\"])[23]")
    public WebElement derssec;

    @FindBy(xpath = "(//input[@name=\"gender\"])[4]")
    public WebElement gendertikla;

    @FindBy(xpath = "(//*[@id=\"birthPlace\"])[2]")
    public WebElement birthplace;

    @FindBy(xpath = "(//*[@id=\"password\"])[2]")
    public WebElement password;

    @FindBy(xpath = "(//button[@type=\"button\"])[29]")
    public WebElement submit;

    @FindBy (xpath = "//*[@class=\" css-19bb58m\"]")
    public WebElement teacherchooseLessons;

    @FindBy(id = "name")
    public WebElement teacherName;

    @FindBy(id = "surname")
    public WebElement teacherSurName;

    @FindBy(id = "birthPlace")
    public WebElement teacherBirthPlace;

    @FindBy(id = "email")
    public WebElement teacherEmail;

    @FindBy(id = "phoneNumber")
    public WebElement teacherPhoneNumber;

    @FindBy(id = "birthDay")
    public WebElement teacherbirthDay;

    @FindBy(id = "ssn")
    public WebElement teacherSsn;

    @FindBy(id = "username")
    public WebElement teacherUserName;

    @FindBy(id = "password")
    public WebElement teacherPassword;

    @FindBy(xpath = "(//*[.='Submit'])[3]")
    public WebElement teacherSubmitButon;

    @FindBy (xpath = "(//*[@name=\"gender\"])[2]")
    public WebElement genderMale;

    @FindBy(xpath = "(//*[.='Teacher saved successfully'])[1]")
    public WebElement teacherSuccessfully;

    @FindBy(xpath = "(//*[.='geçmiş bir tarih olmalı'])[2]")
    public WebElement gecmisTarihOlmaliMesaji;

    @FindBy(xpath = "(//*[.='Please enter valid email'])[2]")
    public WebElement pleaseEnterValidEmailMesaji;

    @FindBy(xpath = "//*[@class=\"css-8mmkcg\"]")
    public WebElement chooseLessonsDelete;

    @FindBy(xpath = "//*[@class=\"Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click\"]")
    public WebElement teacherUyariMesaji;

    @FindBy(xpath = "(//*[@class=\"page-link\"])[5]")
    public WebElement teacherLastPage;

}