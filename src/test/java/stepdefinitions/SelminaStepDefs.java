package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminManagementPage;
import pages.DeanManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class SelminaStepDefs {

    AdminManagementPage adminManagementPage = new AdminManagementPage();
    DeanManagementPage deanManagementPageSelmina = new DeanManagementPage();

    @Then("Kullanici Dean Management butonuna tiklar")
    public void kullanici_dean_management_butonuna_tiklar() {
        ReusableMethods.clickByJS(adminManagementPage.deanManagement);

    }
    @When("Admin Name {string} alanina valid bir deger girer")
    public void admin_name_alanina_valid_bir_deger_girer(String name) {
        deanManagementPageSelmina.deanName.sendKeys(name);

    }
    @When("Admin Surname {string} alanina valid bir deger girer")
    public void admin_surname_alanina_valid_bir_deger_girer(String surname) {
        deanManagementPageSelmina.deanSurname.sendKeys(surname);

    }
    @When("Admin Birth Place {string} alanina valid bir deger girer")
    public void admin_birth_place_alanina_valid_bir_deger_girer(String birtPlace) {
        deanManagementPageSelmina.deanBirthPlace.sendKeys(birtPlace);

    }
    @When("Admin Gender alaninda secim yapar")
    public void admin_gender_alaninda_secim_yapar() {

        deanManagementPageSelmina.deanMaleButton.click();

    }
    @When("Admin Date Of Birth {string} alanina valid bir deger girer")
    public void admin_date_of_birth_alanina_valid_bir_deger_girer(String birtDay) {
        deanManagementPageSelmina.deanBirthDay.sendKeys(birtDay);

    }
    @When("Admin Phone {string} alanina belirtilen formatta valid bir deger girer")
    public void admin_phone_alanina_belirtilen_formatta_valid_bir_deger_girer(String phone) {
        deanManagementPageSelmina.deanPhoneNumber.sendKeys(phone);

    }
    @When("Admin SSN {string} alanina belirtilen formatta valid bir deger girer")
    public void admin_ssn_alanina_belirtilen_formatta_valid_bir_deger_girer(String ssn) {
        deanManagementPageSelmina.deanSsn.sendKeys(ssn);

    }
    @When("Admin Username {string} alanina valid bir deger girer")
    public void admin_username_alanina_valid_bir_deger_girer(String adminUsername) {

        deanManagementPageSelmina.deanAdminUsername.sendKeys(adminUsername);

    }
    @When("Admin Password {string} alanina valid bir deger girer")
    public void admin_password_alanina_valid_bir_deger_girer(String adminPassword) {

        deanManagementPageSelmina.deanAdminPassword.sendKeys(adminPassword);

    }
    @Then("Admin Submit butonuna tiklar")
    public void admin_submit_butonuna_tiklar() {

        ReusableMethods.clickByJS(deanManagementPageSelmina.deanSubmitButton);

    }

    @When("Admin Dean listteki name sutununda bulunan bilgileri gormelidir")
    public void admin_dean_listteki_name_sutununda_bulunan_bilgileri_gormelidir() {

        String xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td)[1]";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(xpath)) ;

        for (WebElement w : list) {
            Assert.assertTrue(w.isDisplayed());
        }

    }
    @When("Admin Dean listteki gender sutununda bulunan bilgileri gormelidir")
    public void admin_dean_listteki_gender_sutununda_bulunan_bilgileri_gormelidir() {

        String xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td)[2]";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(xpath)) ;

        for (WebElement w : list) {
            Assert.assertTrue(w.isDisplayed());
        }

    }
    @When("Admin Dean listteki phone number sutununda bulunan bilgileri gormelidir")
    public void admin_dean_listteki_phone_number_sutununda_bulunan_bilgileri_gormelidir() {

        String xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td)[3]";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(xpath)) ;

        for (WebElement w : list) {
            Assert.assertTrue(w.isDisplayed());
        }


    }
    @When("Admin Dean listteki ssn sutununda bulunan bilgileri gormelidir")
    public void admin_dean_listteki_ssn_sutununda_bulunan_bilgileri_gormelidir() {

        String xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td)[4]";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(xpath)) ;

        for (WebElement w : list) {
            Assert.assertTrue(w.isDisplayed());
        }

    }
    @When("Admin Dean listteki username sutununda bulunan bilgileri gormelidir")
    public void admin_dean_listteki_username_sutununda_bulunan_bilgileri_gormelidir() {

        String xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td)[5]";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(xpath)) ;

        for (WebElement w : list) {
            Assert.assertTrue(w.isDisplayed());
        }

    }

    @When("Admin Dean listteki istedigi bilgileri editleyebilmeli")
    public void admin_dean_listteki_istedigi_bilgileri_editleyebilmeli() {

        ReusableMethods.clickByJS(deanManagementPageSelmina.deanEditButton);

    }





}
