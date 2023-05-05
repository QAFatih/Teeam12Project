package stepdefinitions.ahmet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import pages.AdminManagementPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class stepDefinitions_Ahmet_US_22 {

    ReusableMethods reusableMethods=new ReusableMethods();
    AdminManagementPage adminManagementPage=new AdminManagementPage();
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();



   @Given("Admin {string} gider....")
    public void admin_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("page_url"));
        reusableMethods.waitFor(2);
    }
    @When("Admin logini tiklar....")
    public void admin_logini_tiklar() {
        homePage.loginButton.click();
        reusableMethods.waitFor(2);
    }

    @When("Admin kullanici adini {string} girer....")
    public void admin_kullanici_adini_girer(String string) {
        loginPage.username.sendKeys(ConfigReader.getProperty(string));
        reusableMethods.waitFor(2);
    }
    @When("Admin kullanici parolasini {string} girer....")
    public void admin_kullanici_parolasini_girer(String string) {
        loginPage.password.sendKeys(ConfigReader.getProperty(string));
        reusableMethods.waitFor(2);
    }
    @When("Admin maviLogin'i tiklar....")
    public void admin_mavi_login_i_tiklar() {
        loginPage.loginButton.click();
        reusableMethods.waitFor(2);
    }

    @When("Adminin giris yaptigi dogrulanir.")
    public void adminin_giris_yaptigi_dogrulanir() {
        Assert.assertEquals("kristo",adminManagementPage.adminDogrulama.getText());
        reusableMethods.waitFor(2);
    }

    @When("Admin Name kutusuna {string} yazar....")
    public void admin_name_kutusuna_yazar(String string) {
        adminManagementPage.name.sendKeys(string);
        reusableMethods.waitFor(2);
    }
    @When("Admin Surname kutusuna {string} yazar....")
    public void admin_surname_kutusuna_yazar(String string) {
        adminManagementPage.surname.sendKeys(string);
        reusableMethods.waitFor(2);
        //ReusableMethods.waitFor();
    }
    @When("Admin Birth Place kutusuna {string} yazar....")
    public void admin_birth_place_kutusuna_yazar(String string) {
        adminManagementPage.birthPlace.sendKeys(string);
        reusableMethods.waitFor(2);
    }
    @When("Admin Gender secmeli, {string} tiklar....")
    public void admin_gender_secmeli_tiklar(String string) {
        adminManagementPage.male.click();
        reusableMethods.waitFor(2);
    }

    @When("Admin Date Of Birth girmeli {string} yazar.....")
    public void admin_date_of_birth_girmeli_yazar(String string) {
        adminManagementPage.dateOfBirth.sendKeys(string);
        reusableMethods.waitFor(2);
    }
    @When("Admin Phone bilgileri girmeli {string} girer....")
    public void admin_phone_bilgileri_girmeli_girer(String string) {
        adminManagementPage.phone.sendKeys(string);
        reusableMethods.waitFor(2);
    }
    @When("Admin gecerli bir ssn bilgisi girmeli {string} girer....")
    public void admin_gecerli_bir_ssn_bilgisi_girmeli_girer(String string) {
        adminManagementPage.SSN.sendKeys(string);
        reusableMethods.waitFor(2);
    }
    @When("Admin bir user name girer {string} girer....")
    public void admin_bir_user_name_girer_girer(String string) {
        adminManagementPage.username.sendKeys(string);
        reusableMethods.waitFor(2);
    }
    @When("Admin bir password girer {string}....")
    public void admin_bir_password_girer(String string) {
        adminManagementPage.password.sendKeys(string);
        reusableMethods.waitFor(2);
    }
            @When("Admin submit butonuna basar....")
    public void admin_submit_butonuna_basar() {
        adminManagementPage.submitButton.click();

            reusableMethods.waitFor(10);

        }
    }


