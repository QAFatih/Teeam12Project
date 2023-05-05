package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;

public class GuestUserPage {

    public GuestUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td[1])")
    public WebElement nameSurnameColumn;

    @FindBy(xpath= "//button[@class='btn btn-danger']")
    public WebElement deleteButton;

    @FindBy(xpath="//*[text()=' Guest User deleted Successful']")
    public WebElement deleteMessage;





}