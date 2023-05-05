package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.AdminManagementPage;
import pages.LogoutPage;
import utilities.Driver;

import static base_urls.ManagementOnSchoolBaseUrl.setUp;

public class Hooks {
   AdminManagementPage adminManagementPage = new AdminManagementPage();
   LogoutPage logoutPage = new LogoutPage();
    /*
    Hooks : Her bir Scenario ya da Scenario Outline dan ONCE ya da SONRA calismasmasini istedigim metotlar konur
    @Before ve @After metotlarini icerir
    Burda onemli olan raporlama isleminin ekran goruntusuyle birlikde Hooks yardimiyla yapilmasidir
     */
    @Before
    public void setUpScenarios(){
        System.out.println("Before Metotu");
        setUp();//api icin
    }
    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_"+scenario.getName());
           Driver.closeDriver();

        }

        Driver.closeDriver();


    }
}
