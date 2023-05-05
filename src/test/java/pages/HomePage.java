package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='fa fa-registered']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@class='img-fluid']")
    public WebElement homePageDogrulama;
}

