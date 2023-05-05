package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class ContactGetAllPage {

    public ContactGetAllPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Contact Get All']")
    public WebElement contactGetAllButton;

    @FindBy(xpath = "//*[text()='Contact Message']")
    public WebElement contactMessageBaslik;

    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']")
    public WebElement contactMessageTablo;

    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']//tr[1]//td[1]")
    public WebElement nameKontrol;

    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']//tr[1]//td[2]")
    public WebElement emailKontrol;

    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']//tr[1]//td[3]")
    public WebElement dateKontrol;

    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']//tr[1]//td[4]")
    public WebElement subjectKontrol;

    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']//tr[1]//td[5]")
    public WebElement messageKontrol;


    public int tabloList() {
        int sayac = 0;
        List<WebElement> tablo = null;
        for (int i = 1; i < 20; i++) {
             tablo.add((WebElement) Driver.getDriver().findElements(By.xpath("//*[@class='table table-striped table-bordered table-hover']//tr[" + (i) + "]//td[1]")));
            if (tablo.get(i).getText().contains("")){
                sayac = sayac++;
            }
        }

        return sayac;
    }
}