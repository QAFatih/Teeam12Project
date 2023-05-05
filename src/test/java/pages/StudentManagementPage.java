package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagementPage {

    public StudentManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement name;

    @FindBy(id = "lessonId")
    public WebElement chooseLesson;

    @FindBy(id = "studentId")
    public WebElement chooseStudent;

    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTerm;



    @FindBy(xpath = "//*[text()='Student Management']")
    public WebElement studentbutton;

    @FindBy(xpath = "//*[@id=\"advisorTeacherId\"]")
    public WebElement adviserteacher;

    @FindBy(xpath = "//button[@class=\"fw-semibold btn btn-primary btn-lg\"]")
    public WebElement studentsubmit;

    @FindBy(xpath = "(//a[@class=\"page-link\"])[4]")
    public WebElement sonsayfatiklama;

    @FindBy(xpath = "//*[@class=\"grid gap-8 d-flex justify-content-end align-items-center\"]")
    public WebElement invalidemailmesaji;

    @FindBy(xpath = "(//*[.='geçmiş bir tarih olmalı'])[2]")
    public WebElement alertgecmistarihmesaji;

    @FindBy(xpath = "(//*[.='Please enter valid email'])[4]")
    public WebElement alertinvalidmesaji1;

    @FindBy(xpath = "(//*[.=\"boyut '5' ile '80' arasında olmalı\"])[4]")
    public WebElement alertinvalidmesaj2;

    @FindBy(xpath = "(//*[.='Please select advisor teacher'])[2]")
    public WebElement advisoralertmesaji;

    @FindBy(xpath = "//*[@class=\"table table-striped table-bordered table-hover\"]//tr//td")
    public WebElement studentlist;

    @FindBy(id = "absentee")
    public WebElement absentee;

    @FindBy(id = "midtermExam")
    public WebElement midtermExam;

    @FindBy(id = "finalExam")
    public WebElement finalExam;

    @FindBy(id = "infoNote")
    public WebElement infoNote;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitTeacher;

    @FindBy(xpath = "//*[@class='text-white']")
    public WebElement teacherDogrulama;





}