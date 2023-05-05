package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetManagementPage {

    public MeetManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}