package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonManagementPage {

    public LessonManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramButton;

    @FindBy(id = "controlled-tab-example-tab-lessonsList")
    public WebElement lessonsButton;

    @FindBy(id = "react-select-2-input")
    public WebElement chooseLessons;

    @FindBy(id = "educationTermId")
    public WebElement lessonProgramChooseEducationTerm;

    @FindBy(xpath = "//*[@class='mb-3 form-select']")
    public WebElement chooseDay;

    @FindBy(id = "startTime")
    public WebElement startTime;

    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(xpath = "(//*[@class=\"nav-link\"])[8]")
    public WebElement lessonManagement;

    @FindBy (xpath = "(//*[@class=\"fw-semibold btn btn-primary btn-lg\"])[3]")
    public WebElement lessonProgramFirstSubmit;

    @FindBy (xpath = "(//*[@class=\"fw-semibold btn btn-primary btn-lg\"])[4]")

    public WebElement lessonProgramSecondSubmit;

    @FindBy (xpath = "(//*[@class=\"table table-striped table-bordered table-hover\"])[2]//tbody//tr//td")
    public WebElement lessonProgramListTablosu;

    @FindBy(id = "lessonName")
    public WebElement lessonName;

    @FindBy(id = "creditScore")
    public WebElement creditScore;

    @FindBy(xpath = "(//*[@class=\"fw-semibold btn btn-primary btn-lg\"])[2]")
    public WebElement lessonSubmitButton;

    @FindBy (xpath = "(//*[@id=\"lessonProgramId\"])[5]")
    public WebElement lessonCheckBox;

    @FindBy (xpath = "//*[@id=\"teacherId\"]")
    public WebElement selectTeacher;

    @FindBy(xpath = "(//*[.='Created Lesson Program'])[2]")
    public WebElement createdLessonProgramMesaji;

    @FindBy(xpath = "//*[@class=\"Toastify__toast-body\"]")
    public WebElement hataUyariMesaji;

    @FindBy(xpath = "(//*[.='Lesson Created'])[2]")
    public WebElement createdLessonMesaji;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement stopTimeRequired;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement startTimeRequired;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement message;

    @FindBy(xpath = "(//*[@class=\"page-link\"])[10]")
    public WebElement lessonListLastPage;

    @FindBy(id="compulsory")
    public WebElement compulsory;

}