package pages;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentInfoManagementPage {

    public StudentInfoManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "lessonId")
    public WebElement chooseLesson;

    @FindBy(id = "studentId")
    public WebElement chooseStudent;

    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTerm;

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

    @FindBy(xpath = "//h3[@bg='primary']")
    public WebElement studentInfoBaslik;

    @FindBy(xpath = "(//*[@class=\"Toastify__toast-body\"])[1]")
    public WebElement alert;


    public String tabloLocate(int id) {
        WebElement tablocuk = Driver.getDriver().findElement(By.xpath("//*[@class='table table-striped table-bordered table-hover']//tbody//tr[1]//td[" + id + "]"));

        return tablocuk.getText();

    }
}
