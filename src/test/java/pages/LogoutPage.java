package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogoutPage {

    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='btn btn-warning']")
    public WebElement yesButton;

    @FindBy(xpath = "(//*[@class='d-grid gap-2 col-6 mx-auto'])[2]")
    public WebElement noButton;


}