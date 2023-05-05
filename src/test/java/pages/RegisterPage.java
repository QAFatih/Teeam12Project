package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surname;

    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthPlace;

    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@name='gender']")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement birthDay;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@role = 'alert']")
    public WebElement message;






    public String selectErrorMessageByIndex(int index) {
        String xpath = "(//div[@class='invalid-feedback'])[" + index + "]";
        WebElement errorMessage = Driver.getDriver().findElement(By.xpath(xpath));
        return errorMessage.getText();
    }






}