package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.text.Utilities;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ErenStepDefs {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    GuestUserPage guestUserPage = new GuestUserPage();
    Faker faker = new Faker();

    //US01

    //TC01
    @When("Kullanici Register butonuna tıklar.")
    public void kullanici_register_butonuna_tıklar() {
        homePage.registerButton.click();
    }

    @When("Kullanıcı name textbox'ına gecerli bir deger girer.")
    public void kullanıcı_name_textbox_ına_gecerli_bir_deger_girer() {
        registerPage.name.sendKeys(faker.name().firstName());
    }

    @When("Kullanici surname textbox'ına gecerli bir deger girer.")
    public void kullanici_surname_textbox_ına_gecerli_bir_deger_girer() {
        registerPage.surname.sendKeys(faker.name().lastName());
    }

    @When("Kullanici birth place textbox'ına gecerli bir deger girer.")
    public void kullanici_birth_place_textbox_ına_gecerli_bir_deger_girer() {
        registerPage.birthPlace.sendKeys(faker.address().city());
    }

    @When("Kullanici phone textbox'ına gecerli bir deger girer.")
    public void kullanici_phone_textbox_ına_gecerli_bir_deger_girer() {
        registerPage.phoneNumber.sendKeys(faker.numerify("###-###-####"));
    }

    @When("Kullanici bir gender secer")
    public void kullanici_bir_gender_secer() {
        List<WebElement> checkboxes = registerPage.checkBoxes;
        Random random = new Random();
        int ram = random.nextInt(checkboxes.size());
        if (!checkboxes.get(ram).isSelected()) {
            ReusableMethods.clickByJS(checkboxes.get(ram));
        }
    }

    @When("Kullanici gecerli bir dogum yili girer")
    public void kullanici_gecerli_bir_dogum_yili_girer() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        registerPage.birthDay.sendKeys(sdf.format(faker.date().birthday()));
    }

    @When("Kullanici SSN textbox'ına gecerli bir deger girer.")
    public void kullanici_ssn_textbox_ına_gecerli_bir_deger_girer() {
        registerPage.ssn.sendKeys(faker.numerify("###-##-####"));
    }

    @When("Kullanici Username textbox'ına gecerli bir deger girer.")
    public void kullanici_username_textbox_ına_gecerli_bir_deger_girer() {
        registerPage.userName.sendKeys(faker.name().username());
    }

    @When("Kullanici Password textbox'ına gecerli bir deger girer.")
    public void kullanici_password_textbox_ına_gecerli_bir_deger_girer() {
        registerPage.password.sendKeys(faker.internet().password());
    }

    @And("Kullanici kayıt olmak için Register butonuna tıklar.")
    public void kullaniciKayıtOlmakIçinRegisterButonunaTıklar() {
        ReusableMethods.clickByJS(registerPage.registerButton);
    }

    @Then("Kullanici {string} popup'inin goruntulendigini dogrular.")
    public void kullanici_popup_inin_goruntulendigini_dogrular(String string) {
        ReusableMethods.waitForVisibility(registerPage.message, 4);
        ReusableMethods.hover(registerPage.message);
        Assert.assertEquals(string, registerPage.message.getText());
    }

    //TC02

    @Then("Kullanıcı Name textbox'ının altında {string} uyarısını görür")
    public void kullanıcıNameTextboxInınAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0, registerPage.selectErrorMessageByIndex(1));
    }

    //TC03
    @Then("Kullanıcı Surname textbox'ının altında {string} uyarısını görür")
    public void kullanıcıSurnameTextboxInınAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0, registerPage.selectErrorMessageByIndex(2));
    }

    //TC04
    @Then("Kullanıcı birthplace textbox'ının altında {string} uyarısını görür")
    public void kullanıcıBirthplaceTextboxInınAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0, registerPage.selectErrorMessageByIndex(3));
    }

    //TC05
    @Then("Kullanıcı phone number textbox'ının altında {string} uyarısını görür")
    public void kullanıcıPhoneNumberTextboxInınAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0, registerPage.selectErrorMessageByIndex(4));
    }

    //TC06
    @And("Kullanıcı Phone textbox'ını yanlış formatta doldurur")
    public void kullanıcıPhoneTextboxInıYanlışFormattaDoldurur() {
        registerPage.phoneNumber.sendKeys(faker.numerify("##########"));

    }

    @Then("Kullanıcı Phone textbox'ının altında {string} uyarısını görür")
    public void kullanıcıPhoneTextboxInınAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0, registerPage.selectErrorMessageByIndex(4));

    }

    //TC07

    @And("Kullanıcı Phone textbox'ına sayı dışında bir şey girer")
    public void kullanıcıPhoneTextboxInaSayıDışındaBirŞeyGirer() {
        registerPage.phoneNumber.sendKeys(faker.letterify("???????????????"));
    }

    @Then("Kullanıcı {string} popup'ını görür")
    public void kullanıcıPopupInıGörür(String arg0) {
        ReusableMethods.waitForVisibility(registerPage.message, 4);
        ReusableMethods.hover(registerPage.message);
        Assert.assertEquals(arg0, registerPage.message.getText());
    }


//----------------------------------US08 BUGGED----------------------------------------------


    //TC09

    @Then("Kullanıcı Date of Birth'ün altında {string} uyarısını görür")
    public void kullanıcıDateOfBirthÜnAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0, registerPage.selectErrorMessageByIndex(5));
    }

    //TC10
    @And("Kullanıcı güncel veya ileri tarihte bir doğum yılı girer")
    public void kullanıcıGüncelVeyaIleriTarihteBirDoğumYılıGirer() {
        Date currentDate = new Date();

        int days = faker.random().nextInt(365) + 1;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        Date futureDate = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        registerPage.birthDay.sendKeys(format.format(futureDate));
    }

    @And("Kullanıcı birthday icin {string} popup'ını görür")
    public void kullanıcıBirthdayIcinPopupInıGörür(String arg0) {
        ReusableMethods.waitForVisibility(registerPage.message, 4);
        ReusableMethods.hover(registerPage.message);
        Assert.assertEquals(arg0, registerPage.message.getText());
    }

    //TC11
    @Then("Kullanıcı SSN'in altında {string} uyarısını görür")
    public void kullanıcıSSNInAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0, registerPage.selectErrorMessageByIndex(6));
    }
    //TC12

    @And("Kullanıcı SSN textbox'ını yanlış formatta doldurur")
    public void kullanıcıSSNTextboxInıYanlışFormattaDoldurur() {
        registerPage.ssn.sendKeys(faker.numerify("########"));

    }

    //TC13

    @And("Kullanıcı SSN textbox'ına sayı dışında bir şey girer")
    public void kullanıcıSSNTextboxInaSayıDışındaBirŞeyGirer() {
        registerPage.ssn.sendKeys(faker.letterify("???????????????"));
    }

    @Then("Kullanıcı SSN icin {string} popup'ını görür")
    public void kullanıcıSSNIcinPopupInıGörür(String arg0) {
        ReusableMethods.waitForVisibility(registerPage.message, 4);
        ReusableMethods.hover(registerPage.message);
        Assert.assertEquals(arg0, registerPage.message.getText());
    }

    //TC14
    @Then("Kullanıcı Username'in altında {string} uyarısını görür")
    public void kullanıcıUsernameInAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0, registerPage.selectErrorMessageByIndex(7));
    }



    //TC15

    @Then("Kullanıcı Password'ün altında {string} uyarısını görür")
    public void kullanıcıPasswordÜnAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0, registerPage.selectErrorMessageByIndex(8));

    }

    //TC16

    @And("Kullanıcı Password textbox'ına {int} karakterden az bir şifre girer.")
    public void kullanıcıPasswordTextboxInaKarakterdenAzBirŞifreGirer(int arg0) {
        registerPage.password.sendKeys(faker.internet().password(1,(arg0-1)));
    }

    @Then("Kullanıcı Password'un altında {string} uyarısını görür")
    public void kullanıcıPasswordUnAltındaUyarısınıGörür(String arg0) {
        Assert.assertEquals(arg0,registerPage.selectErrorMessageByIndex(8));
    }


    //US02

    //TC01

    @When("Kullanıcı Login butonuna tıklar")
    public void kullanıcı_login_butonuna_tıklar() {
       homePage.loginButton.click();
    }
    @When("Kullanıcı User Name textbox'ına Admin girişi için geçerli bir Username girer")
    public void kullanıcı_user_name_textbox_ına_admin_girişi_için_geçerli_bir_username_girer() {
        loginPage.username.sendKeys(ConfigReader.getProperty("admin_username"));
    }
    @When("Kullanıcı password textbox'ına Admin girişi için geçerli bir password girer")
    public void kullanıcı_password_textbox_ına_admin_girişi_için_geçerli_bir_password_girer() {
        loginPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
    }
    @And("Kullanıcı giris yapmak icin Login butonuna tıklar")
    public void kullanıcıGirisYapmakIcinLoginButonunaTıklar() {
        loginPage.loginButton.click();
    }
    @When("Kullanıcı Menu butonuna tıklar")
    public void kullanıcı_menu_butonuna_tıklar() {
        adminManagementPage.menuButton.click();
    }
    @When("Kullanıcı açılan Main Menu\"de bulunan Guest User a tıklar")
    public void kullanıcı_açılan_main_menu_de_bulunan_guest_user_a_tıklar() {
        adminManagementPage.guestUser.click();
    }
    @Then("Kullanıcı Guest User'ların Name-Surname sütununda bulunan bilgilerini görebilmelidir.")
    public void kullanıcı_guest_user_ların_name_surname_sütununda_bulunan_bilgilerini_görebilmelidir() {
        String xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td[1])";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(xpath));
        for (WebElement w : list) {
            Assert.assertTrue(w.isDisplayed());
        }
    }
    @Then("Kullanıcı Guest User'ların Phone Number sütununda bulunan bilgilerini görebilmelidir.")
    public void kullanıcı_guest_user_ların_phone_number_sütununda_bulunan_bilgilerini_görebilmelidir() {
        String xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td[2])";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(xpath));
        for (WebElement w : list) {
            Assert.assertTrue(w.isDisplayed());
        }

    }
    @Then("Kullanıcı Guest User'ların Ssn sütununda bulunan bilgilerini görebilmelidir.")
    public void kullanıcı_guest_user_ların_ssn_sütununda_bulunan_bilgilerini_görebilmelidir() {
        String xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td[3])";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(xpath));
        for (WebElement w : list) {
            Assert.assertTrue(w.isDisplayed());
        }
    }
    @Then("Kullanıcı Guest User'ların User Name sütununda bulunan bilgilerini görebilmelidir.")
    public void kullanıcı_guest_user_ların_user_name_sütununda_bulunan_bilgilerini_görebilmelidir() {
        String xpath = "(//*[@class='table table-striped table-bordered table-hover']/tbody/tr/td[4])";
        List<WebElement> list = Driver.getDriver().findElements(By.xpath(xpath));
        for (WebElement w : list) {
            Assert.assertTrue(w.isDisplayed());
        }
    }

    //TC02

    @When("Kullanıcı silmek istediği Guest User'in bilgilerinin sağında yer alan çöp kutusu butonuna tıklar")
    public void kullanıcıSilmekIstediğiGuestUserInBilgilerininSağındaYerAlanÇöpKutusuButonunaTıklar() {
        guestUserPage.deleteButton.click();
    }

    @Then("Kullanıcı {string} popup'ını görebilmelidir")
    public void kullanıcıPopupInıGörebilmelidir(String arg0) {
        ReusableMethods.waitForVisibility(guestUserPage.deleteMessage, 4);
        ReusableMethods.hover(guestUserPage.deleteMessage);
        Assert.assertEquals(arg0, guestUserPage.deleteMessage.getText());
    }
}
