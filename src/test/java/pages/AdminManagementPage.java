package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;


public class AdminManagementPage {


    public AdminManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement menuButton;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(xpath = "//*[@value='FEMALE']")
    public WebElement female;

    @FindBy(xpath = "//*[@value='MALE']")
    public WebElement male;

    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;

    @FindBy(id = "phoneNumber")
    public WebElement phone;

    @FindBy(id = "ssn")
    public WebElement SSN;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton;

    @FindBy(xpath = "(//span[@class='visually-hidden'])[5]")
    public WebElement lastPage;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[2]")
    public WebElement deanManagement;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[3]")
    public WebElement viceDeanManagement;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[4]")
    public WebElement lessonManagement;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[5]")
    public WebElement teacherManagement;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[6]")
    public WebElement studentManagement;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[7]")
    public WebElement studentInfoManagement;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[8]")
    public WebElement meetManagement;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[9]")
    public WebElement chooseLesson;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[10]")
    public WebElement contactGetAll;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[11]")
    public WebElement guestUser;

    @FindBy(xpath = "(//*[@role='dialog']//*[@role='button'])[12]")
    public WebElement logout;
    @FindBy(xpath = "(//*[.='Admin Management'])[3]")
    public WebElement adminManagementIsDisplayed;


    @FindBy(xpath = "//*[@class=\"Toastify__toast-container Toastify__toast-container--top-center\"]")
    public WebElement adminUyariMesaji;

    @FindBy(xpath = "//*[@Class='text-white']")
    public WebElement adminDogrulama;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement alert1;

    public void delete(String SSN){

        Actions a = new Actions(Driver.getDriver());
        a.scrollToElement(lastPage);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(lastPage);
        ReusableMethods.waitFor(3);

        List<WebElement> admins = Driver.getDriver().findElements(By.xpath("//*[@class='table table-striped table-bordered table-hover']//tbody//tr"));

        for (WebElement w : admins){
            if (w.getText().contains(SSN)){
                int no = admins.indexOf(w) + 1;//tabloda karsilik gelen satiri buluyorum
                System.out.println("no = " + no);
                ReusableMethods.
                        clickByJS(Driver.
                                getDriver().
                                findElement(By.
                                        xpath("//*[@class='table table-striped table-bordered table-hover']//tbody//tr["+no+"]//td[6]//*[@type='button']")));
            }
        }
    }

    public void deleteAdmin(String SSN){

        List<WebElement> admins = Driver.getDriver().findElements(By.xpath("//*[@class='mt-5 ms-3 me-3 mb-5 text-center border border-3 shadow-sm bg-body rounded card border-warning']"));


        for (WebElement w : admins){
            if (w.getText().contains(SSN)){
                int no = admins.indexOf(w) + 1;//tabloda karsilik gelen satiri buluyorum
                System.out.println("no = " + no);
                ReusableMethods.clickByJS(Driver.getDriver().findElement(By.xpath("//*[@class='mt-5 ms-3 me-3 mb-5 text-center border border-3 shadow-sm bg-body rounded card border-warning']["+no+"]//td[6]//*[@type='button']")));
            }
        }
    }

    @FindBy(xpath = "//*[@class='fw-bold p-3 card-header']")
    public WebElement adminManagementSayfaDogrulama;




}