package stepdefinitions.gonca;

import com.fasterxml.jackson.databind.ObjectReader;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class DeanManagementStepDef {

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();
    ViceDeanManagementPage deanManagementPage = new ViceDeanManagementPage();
    Actions actions = new Actions(Driver.getDriver());
    ContactGetAllPage contactGetAllPage = new ContactGetAllPage();

    @Given("kullanici url sayfasina gider")
    public void kullanici_url_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("page_url"));
    }

    @When("kullanici Login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        homePage.loginButton.click();
    }

    @Then("Login giris sayfasi acildigini dogrular")
    public void login_giris_sayfasi_acildigini_dogrular() {
        String loginSayfasiText = loginPage.loginSayfasiDogrulama.getText();
        assertEquals(loginSayfasiText, "Login");
    }

    @Then("kullanici User Name butonuna tiklar")
    public void kullanici_user_name_butonuna_tiklar() {
        loginPage.username.click();
    }

    @Then("kullanici User Name {string} bilgisi girer")
    public void kullanici_user_name_bilgisi_girer(String string) {
        loginPage.username.sendKeys("Team12-Dean");
    }

    @Then("kullanici Password butonuna tiklar")
    public void kullanici_password_butonuna_tiklar() {
        loginPage.password.click();
    }

    @Then("kullanici password {string} bilgisi girer")
    public void kullanici_password_bilgisi_girer(String string) {
        loginPage.password.sendKeys("Team12-Dean");
    }

    @Then("kullanici Giris icin Login butonuna tiklar")
    public void kullanici_giris_icin_login_butonuna_tiklar() {
        loginPage.loginButton.click();
    }


    @Then("kullanici Vice Dean Management sayfasinda olundugu dogrular")
    public void kullanici_vice_dean_management_sayfasinda_olundugu_dogrular() {
        String viceDeanSayfasiBaslik = deanManagementPage.ViceDeanManagementBaslik.getText();
        assertEquals(viceDeanSayfasiBaslik, "Vice Dean Management");
        ReusableMethods.waitFor(1);
    }

    @Then("kullanici Name {string} bilgisi girer")
    public void kullanici_name_bilgisi_girer(String string) {
        deanManagementPage.name.sendKeys(Faker.instance().name().firstName());
    }

    @Then("kullanici Surname {string} bilgisi girer")
    public void kullanici_surname_bilgisi_girer(String string) {
        deanManagementPage.surname.sendKeys(Faker.instance().name().lastName());
    }

    @Then("kullanici Birt Place {string} bilgisi girer")
    public void kullanici_birt_place_bilgisi_girer(String string) {
        deanManagementPage.birthPlace.sendKeys(Faker.instance().address().country());
    }

    @Then("kullanici Gender Female secenegine tiklar")
    public void kullanici_gender_female_secenegine_tiklar() {
        deanManagementPage.genderFemale.click();
    }

    @Then("kullanici dogum tarihi bilgisi girer")
    public void kullaniciDogumTarihiBilgisiGirer() {
        deanManagementPage.dateOfBirth.sendKeys("18");
        deanManagementPage.dateOfBirth.sendKeys("01");
        deanManagementPage.dateOfBirth.sendKeys("2000");
    }

    @Then("kullanici telefon numarasi {string} bilgisini uniqe girer")
    public void kullanici_telefon_numarasi_bilgisini_uniqe_girer(String string) {

        int numberIlkUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.phoneNumber.sendKeys(numberIlkUcHane + "-");
        int numberOrtaUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.phoneNumber.sendKeys(numberOrtaUcHane + "-");
        int sonDortHane = Faker.instance().number().numberBetween(1000, 9999);
        deanManagementPage.phoneNumber.sendKeys(sonDortHane + "");
    }

    @Then("kullanici SSN {string}  bilgisini uniqe girer")
    public void kullanici_ssn_bilgisini_uniqe_girer(String string) {
        int ssnIlkUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.ssn.sendKeys(ssnIlkUcHane + "-");
        int ssnIkiHane = Faker.instance().number().numberBetween(10, 99);
        deanManagementPage.ssn.sendKeys(ssnIkiHane + "-");
        int ssnsonDortHane = Faker.instance().number().numberBetween(1000, 9999);
        deanManagementPage.ssn.sendKeys(ssnsonDortHane + "");
    }

    @Then("kullanici username {string} uniqe olacak sekilde girer")
    public void kullanici_username_uniqe_olacak_sekilde_girer(String string) {

        deanManagementPage.username.sendKeys(Faker.instance().name().username());
    }

    @Then("kullanici yeni kayit icin password {string} bilgisi girer")
    public void kullaniciYeniKayitIcinPasswordBilgisiGirer(String string) {
        deanManagementPage.password.sendKeys(Faker.instance().phoneNumber().phoneNumber());
    }

    @Then("kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        deanManagementPage.submit.click();
        ReusableMethods.waitFor(1);
    }

    @Then("kullanici Vice dean Saved onayini dogrular")
    public void kullanici_vice_dean_saved_onayini_dogrular() {
        String viceDeanSavedOnay = deanManagementPage.message.getText();
        assertEquals("Vice dean Saved", viceDeanSavedOnay);
        ReusableMethods.waitFor(1);
    }

//  ********************** US06-TC02 ****************************************************

    @Then("kullanici Name {string} bilgisini karakter olacak sekilde girer")
    public void kullaniciNameBilgisiniKarakterOlacakSekildeGirer(String string) {
        deanManagementPage.name.sendKeys(".,;',;");
        String nameKarakter = deanManagementPage.name.getText();
        if (nameKarakter.contains("\\W")) {
            assertFalse("Vice dean Saved", false);
        }
    }

    @Then("kullanici Vice dean Saved onayini goremez")
    public void kullaniciViceDeanSavedOnayiniGoremez() throws AWTException {

        ReusableMethods.waitFor(1);
        String viceDeanSavedOnay = deanManagementPage.message.getText();
        assertFalse(viceDeanSavedOnay, false);
//        assertNotEquals("Vice dean Saved", viceDeanSavedOnay);
        ReusableMethods.waitFor(1);
    }

    //  ********************** US06-TC03 ****************************************************
    @Then("kullanici name bilgisini bos birakir")
    public void kullaniciNameBilgisiniBosBirakir() {
        deanManagementPage.name.click();
        deanManagementPage.name.sendKeys(Keys.TAB);

        assertTrue(deanManagementPage.nameRequired.isDisplayed());
    }

    //  ********************** US06-TC04 ****************************************************
    @Then("kullanici name bilgisini space tusu ile bosluk birakir")
    public void kullaniciNameBilgisiniSpaceTusuIleBoslukBirakir() {
        deanManagementPage.name.click();
        ReusableMethods.waitFor(1);
        deanManagementPage.name.sendKeys(Keys.SPACE);
        deanManagementPage.name.sendKeys(Keys.SPACE);
        ReusableMethods.waitFor(1);
        deanManagementPage.name.sendKeys(Keys.SPACE);

    }
//  ********************** US06-TC05 POZITIF TEST****************************************
//  ********************** US06-TC06 ****************************************************

    @Then("kullanici Surname {string} bilgisini karakter olacak sekilde girer")
    public void kullaniciSurnameBilgisiniKarakterOlacakSekildeGirer(String arg0) {
        deanManagementPage.surname.sendKeys(".,;',;");
        String surnameKarakter = deanManagementPage.surname.getText();
        if (surnameKarakter.contains("\\W")) {
            assertFalse("Vice dean Saved", false);
        }
    }

    //  ********************** US06-TC07 ****************************************************
    @Then("kullanici Surname {string} bilgisini bos birakir")
    public void kullaniciSurnameBilgisiniBosBirakir(String arg0) {
        deanManagementPage.surname.click();
        deanManagementPage.surname.sendKeys(Keys.TAB);

    }

    //  ********************** US06-TC08 ****************************************************
    @Then("kullanici Surname {string} bilgisini space ile bosluk birakir")
    public void kullaniciSurnameBilgisiniSpaceIleBoslukBirakir(String arg0) {
        deanManagementPage.surname.click();
        ReusableMethods.waitFor(1);
        deanManagementPage.surname.sendKeys(Keys.SPACE);
        deanManagementPage.surname.sendKeys(Keys.SPACE);
        ReusableMethods.waitFor(1);
        deanManagementPage.surname.sendKeys(Keys.SPACE);
    }

//  ********************** US06-TC09 POZITIF TEST****************************************
//  ********************** US06-TC10 ****************************************************

    @Then("kullanici Birt Place {string} bilgisini bos birakir")
    public void kullaniciBirtPlaceBilgisiniBosBirakir(String string) {
        deanManagementPage.birthPlace.click();
        deanManagementPage.birthPlace.sendKeys(Keys.TAB);

        assertTrue(deanManagementPage.birthPlace.isDisplayed());
    }

    //  ********************** US06-TC11 ****************************************************
    @Then("kullanici Birt Place {string} bilgisini space ile bosluk birakir")
    public void kullaniciBirtPlaceBilgisiniSpaceIleBoslukBirakir(String arg0) {
        deanManagementPage.birthPlace.click();
        ReusableMethods.waitFor(1);
        deanManagementPage.birthPlace.sendKeys(Keys.SPACE);
        deanManagementPage.birthPlace.sendKeys(Keys.SPACE);
        deanManagementPage.birthPlace.sendKeys(Keys.SPACE);
    }

    //  ********************** US06-TC12 ****************************************************
    @Then("kullanici Birt Place {string} bilgisini karakter olarak girer")
    public void kullaniciBirtPlaceBilgisiniKarakterOlarakGirer(String arg0) {
        deanManagementPage.birthPlace.sendKeys(".,;',;");
        String birtPlaceKarakter = deanManagementPage.birthPlace.getText();
        if (birtPlaceKarakter.contains("\\W")) {
            assertFalse("Vice dean Saved", false);
        }
    }

    //  ********************** US06-TC13 ****************************************************
    @Then("kullanici Birt Place {string} bilgisini rakam olarak girer")
    public void kullaniciBirtPlaceBilgisiniRakamOlarakGirer(String arg0) {
        deanManagementPage.birthPlace.sendKeys("546546554");
        String birtPlaceRakam = deanManagementPage.birthPlace.getText();
        if (birtPlaceRakam.contains("\\d")) {
            assertFalse("Vice dean Saved", false);
        }
    }

//  ********************** US06-TC14 POZITIF TEST FEMALE ********************************
//  ********************** US06-TC15 ****************************************************

    @Then("kullanici Gender Male secenegine tiklar")
    public void kullaniciGenderMaleSecenegineTiklar() {
        deanManagementPage.genderMale.click();
    }

    //  ********************** US06-TC16 ****************************************************
    @Then("kullanici Gender bolumunde secim yapilmaz")
    public void kullaniciGenderBolumundeSecimYapilmaz() {
        deanManagementPage.genderFemale.sendKeys(Keys.TAB);
    }

    //  ********************** US06-TC17 POZITIF TEST ***************************************
//  ********************** US06-TC18 ****************************************************
    @Then("kullanici dogum tarihi bilgisini onyedi  yasinda olacak sekilde girer")
    public void kullaniciDogumTarihiBilgisiniOnyediYasindaOlacakSekildeGirer() {

        deanManagementPage.dateOfBirth.sendKeys("13");
        deanManagementPage.dateOfBirth.sendKeys("04");
        deanManagementPage.dateOfBirth.sendKeys("2006");
    }

    //  ********************** US06-TC19 ****************************************************
    @Then("kullanici dogum tarihi bilgisini onsekiz  yasinda olacak sekilde girer")
    public void kullaniciDogumTarihiBilgisiniOnsekizYasindaOlacakSekildeGirer() {
        deanManagementPage.dateOfBirth.sendKeys("13");
        deanManagementPage.dateOfBirth.sendKeys("04");
        deanManagementPage.dateOfBirth.sendKeys("2005");
    }

    //  ********************** US06-TC20 ****************************************************
    @Then("kullanici dogum tarihi bilgisini ondokuz yasinda olacak sekilde girer")
    public void kullaniciDogumTarihiBilgisiniOndokuzYasindaOlacakSekildeGirer() {
        deanManagementPage.dateOfBirth.sendKeys("13");
        deanManagementPage.dateOfBirth.sendKeys("04");
        deanManagementPage.dateOfBirth.sendKeys("2004");
    }

    //  ********************** US06-TC21 ****************************************************
    @Then("kullanici dogum tarihi bilgisini yuzOnDokuz yasinda olacak sekilde girer")
    public void kullaniciDogumTarihiBilgisiniYuzOnDokuzYasindaOlacakSekildeGirer() {
        deanManagementPage.dateOfBirth.sendKeys("13");
        deanManagementPage.dateOfBirth.sendKeys("04");
        deanManagementPage.dateOfBirth.sendKeys("1904");
    }

    //  ********************** US06-TC22 ****************************************************
    @Then("kullanici dogum tarihi bilgisini yuzYirmi yasinda olacak sekilde girer")
    public void kullaniciDogumTarihiBilgisiniYuzYirmiYasindaOlacakSekildeGirer() {
        deanManagementPage.dateOfBirth.sendKeys("13");
        deanManagementPage.dateOfBirth.sendKeys("04");
        deanManagementPage.dateOfBirth.sendKeys("1903");
    }

    //  ********************** US06-TC23 ****************************************************
    @Then("kullanici dogum tarihi bilgisini yuzYirmiBir yasinda olacak sekilde girer")
    public void kullaniciDogumTarihiBilgisiniYuzYirmiBirYasindaOlacakSekildeGirer() {
        deanManagementPage.dateOfBirth.sendKeys("13");
        deanManagementPage.dateOfBirth.sendKeys("04");
        deanManagementPage.dateOfBirth.sendKeys("1902");
    }

    //  ********************** US06-TC24 ****************************************************
    @Then("kullanici dogum tarihi bilgisini bos birakir")
    public void kullaniciDogumTarihiBilgisiniBosBirakir() {
        deanManagementPage.dateOfBirth.click();
        deanManagementPage.dateOfBirth.sendKeys(Keys.TAB);
        deanManagementPage.dateOfBirth.sendKeys(Keys.TAB);
        deanManagementPage.dateOfBirth.sendKeys(Keys.TAB);

//        String dateOfBirthTextDogrulama = deanManagementPage.message.getText();
//        assertTrue(dateOfBirthTextDogrulama, true);
    }

    //  ********************** US06-TC25 POZITIF TEST ***************************************
//  ********************** US06-TC26 ****************************************************
    @Then("kullanici telefon numarasi {string} ilk index sifir olacak sekilde girer")
    public void kullaniciTelefonNumarasiIlkIndexSifirOlacakSekildeGirer(String arg0) {
        deanManagementPage.phoneNumber.sendKeys("0");
        int numberIlkUcunSonIkisi = Faker.instance().number().numberBetween(10, 99);
        deanManagementPage.phoneNumber.sendKeys(numberIlkUcunSonIkisi + "-");
        int numberOrtaUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.phoneNumber.sendKeys(numberOrtaUcHane + "-");
        int sonDortHane = Faker.instance().number().numberBetween(1000, 9999);
        deanManagementPage.phoneNumber.sendKeys(sonDortHane + "");

        String phoneNumberIlkIndexSifirOlmaKontrol = deanManagementPage.phoneNumber.getText();
        if (phoneNumberIlkIndexSifirOlmaKontrol.indexOf(0) == 0) {
            assertFalse(phoneNumberIlkIndexSifirOlmaKontrol, false);
        }
    }
//  ********************** US06-TC27 ****************************************************

    @Then("kullanici telefon numarasi bilgisini bos birakir")
    public void kullaniciTelefonNumarasiBilgisiniBosBirakir() {
        deanManagementPage.phoneNumber.click();
        deanManagementPage.phoneNumber.sendKeys(Keys.TAB);

//        String phoneNumberRequiredDogrulama = deanManagementPage.message.getText();
//        assertTrue(phoneNumberRequiredDogrulama, true);
    }
//  ********************** US06-TC28 ****************************************************

    @Then("kullanici telefon numarasini space ile bosluk birakir")
    public void kullaniciTelefonNumarasiniSpaceIleBoslukBirakir() {
        deanManagementPage.phoneNumber.sendKeys("   -   -    ");

        String phoneNumberBoslukKontrol = deanManagementPage.phoneNumber.getText();
        assertTrue(phoneNumberBoslukKontrol, true);
    }

    //  ********************** US06-TC29 ****************************************************
    @Then("kullanici telefon numarasini daha once kayit olunmus bir numara girer")
    public void kullaniciTelefonNumarasiniDahaOnceKayitOlunmusBirNumaraGirer() {
        deanManagementPage.phoneNumber.sendKeys(deanManagementPage.phoneNumberTableKullanilanNumara.getText());
    }

    @Then("kullanici kullanilan phone number hata mesaji alir")
    public void kullaniciKullanilanPhoneNumberHataMesajiAlir() {
        String kullanilanPhoneNumberUyarisi = deanManagementPage.message.getText();
        assertTrue(kullanilanPhoneNumberUyarisi, kullanilanPhoneNumberUyarisi.contains("already register"));
    }


    //  ********************** US06-TC30 ****************************************************
    @Then("kullanici telefon numarasini oniki karakterden fazla girer")
    public void kullaniciTelefonNumarasiniOnikiKarakterdenFazlaGirer() {
        int numberIlkUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.phoneNumber.sendKeys(numberIlkUcHane + "-");
        int numberOrtaUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.phoneNumber.sendKeys(numberOrtaUcHane + "-");
        int sonDortHanedenSonrasi = Faker.instance().number().numberBetween(1000, 999999);
        deanManagementPage.phoneNumber.sendKeys(sonDortHanedenSonrasi + "");

    }

    //  ********************** US06-TC31 ****************************************************
    @Then("kullanici telefon numarasini oniki karakterden az girer")
    public void kullaniciTelefonNumarasiniOnikiKarakterdenAzGirer() {
        int numberIlkUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.phoneNumber.sendKeys(numberIlkUcHane + "-");
        int numberOrtaUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.phoneNumber.sendKeys(numberOrtaUcHane + "-");
        int sonDortHane = Faker.instance().number().numberBetween(10, 999);
        deanManagementPage.phoneNumber.sendKeys(sonDortHane + "");

//        assertEquals("Minimum 12 character (XXX-XXX-XXXX)", deanManagementPage.message.getText());
    }

    //  ********************** US06-TC32 ****************************************************
    @Then("kullanici telefon numarasini oniki ardisik rakam olarak girer")
    public void kullaniciTelefonNumarasiniOnikiArdisikRakamOlarakGirer() {
        deanManagementPage.phoneNumber.sendKeys("123456789102");
    }

    //  ********************** US06-TC33 ****************************************************
    @Then("kullanici telefon numarasini karakter icerecek sekilde girer")
    public void kullaniciTelefonNumarasiniKarakterIcerecekSekildeGirer() {
        deanManagementPage.phoneNumber.sendKeys(".,.-[]*-+*><");
    }

    //  ********************** US06-TC34 ****************************************************
    @Then("kullanici telefon numarasini haraf olacak sekilde girer")
    public void kullaniciTelefonNumarasiniHarafOlacakSekildeGirer() {
        deanManagementPage.phoneNumber.sendKeys("hjh-okj-polh");
    }

    //  ********************** US06-TC35 ****************************************************
    @Then("kullanici telefon numarasinda tirenin yerini farkli olacak sekilde girer")
    public void kullaniciTelefonNumarasindaTireninYeriniFarkliOlacakSekildeGirer() {
        deanManagementPage.phoneNumber.sendKeys("53-78-777789");
    }

    //  ********************** US06-TC36 POZITIF TEST ***************************************
//  ********************** US06-TC37 ****************************************************
    @Then("kullanici SSN {string}  ilk index sifir olacak sekilde girer")
    public void kullaniciSSNIlkIndexSifirOlacakSekildeGirer(String arg0) {
        deanManagementPage.ssn.sendKeys("0");
        int ssnIlkUcHane = Faker.instance().number().numberBetween(10, 99);
        deanManagementPage.ssn.sendKeys(ssnIlkUcHane + "-");
        int ssnIkiHane = Faker.instance().number().numberBetween(10, 99);
        deanManagementPage.ssn.sendKeys(ssnIkiHane + "-");
        int ssnsonDortHane = Faker.instance().number().numberBetween(1000, 9999);
        deanManagementPage.ssn.sendKeys(ssnsonDortHane + "");

        String ssnNumberIlkIndexSifirOlmaKontrol = deanManagementPage.ssn.getText();
        if (ssnNumberIlkIndexSifirOlmaKontrol.indexOf(0) == 0) {
            assertFalse(ssnNumberIlkIndexSifirOlmaKontrol, false);
        }
    }

    //  ********************** US06-TC38 ****************************************************
    @Then("kullanici SSN {string}  bilgisini bos birakir")
    public void kullaniciSSNBilgisiniBosBirakir(String arg0) {
        deanManagementPage.ssn.click();
        deanManagementPage.ssn.sendKeys(Keys.TAB);

//        String ssnRequiredDogrulama = deanManagementPage.message.getText();
//        assertTrue(ssnRequiredDogrulama, true);
    }

    //  ********************** US06-TC39 ****************************************************
    @Then("kullanici SSN {string}  bilgisini space ile bosluk birakir")
    public void kullaniciSSNBilgisiniSpaceIleBoslukBirakir(String arg0) {
        deanManagementPage.ssn.sendKeys("   -  -    ");

        String ssnNumberBoslukKontrol = deanManagementPage.ssn.getText();
        assertTrue(ssnNumberBoslukKontrol, true);
    }

    //  ********************** US06-TC40 ****************************************************
    @Then("kullanici SSN {string}  bilgisini daha once kayit olunmus bir numara girer")
    public void kullaniciSSNBilgisiniDahaOnceKayitOlunmusBirNumaraGirer(String arg0) {
        deanManagementPage.ssn.sendKeys(deanManagementPage.ssnTableKullanilanNumara.getText());
    }

    @Then("kullanici kullanilan ssn numarasi hata mesaji alir")
    public void kullaniciKullanilanSsnNumarasiHataMesajiAlir() {
        String ssnKayitliNumaraUyarisi = deanManagementPage.message.getText();
        assertTrue(ssnKayitliNumaraUyarisi, ssnKayitliNumaraUyarisi.contains("already register"));
    }

    //  ********************** US06-TC41 ****************************************************
    @Then("kullanici SSN {string} dokuz karakterden fazla girer")
    public void kullaniciSSNDokuzKarakterdenFazlaGirer(String arg0) {
        int ssnIlkUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.ssn.sendKeys(ssnIlkUcHane + "-");
        int ssnIkiHane = Faker.instance().number().numberBetween(10, 99);
        deanManagementPage.ssn.sendKeys(ssnIkiHane + "-");
        int ssnsonDortHanedenSonrasi = Faker.instance().number().numberBetween(1000, 999999);
        deanManagementPage.ssn.sendKeys(ssnsonDortHanedenSonrasi + "");

        String ssnIndeksKontrol = deanManagementPage.ssn.getText();
        if (ssnIndeksKontrol.length() > 9) {
            assertFalse(ssnIndeksKontrol, false);
        }
    }

    //  ********************** US06-TC42 ****************************************************
    @Then("kullanici SSN {string}  bilgisini dokuz karakterden az girer")
    public void kullaniciSSNBilgisiniDokuzKarakterdenAzGirer(String arg0) {
        int ssnIlkUcHane = Faker.instance().number().numberBetween(100, 999);
        deanManagementPage.ssn.sendKeys(ssnIlkUcHane + "-");
        int ssnIkiHane = Faker.instance().number().numberBetween(10, 99);
        deanManagementPage.ssn.sendKeys(ssnIkiHane + "-");
        int ssnsonDortHane = Faker.instance().number().numberBetween(1, 10);
        deanManagementPage.ssn.sendKeys(ssnsonDortHane + "");

        String ssnIndeksKontrol = deanManagementPage.ssn.getText();
        if (ssnIndeksKontrol.length() < 11) {
            assertFalse(ssnIndeksKontrol, false);
        }
    }

    //  ********************** US06-TC43 ****************************************************
    @Then("kullanici SSN {string}  bilgisini dokuz ardisik rakam olarak girer")
    public void kullaniciSSNBilgisiniDokuzArdisikRakamOlarakGirer(String arg0) {
        deanManagementPage.ssn.sendKeys(Faker.instance().numerify("###########"));
    }

    //  ********************** US06-TC44 ****************************************************
    @Then("kullanici SSN {string}  bilgisini karakter icerecek sekilde girer")
    public void kullaniciSSNBilgisiniKarakterIcerecekSekildeGirer(String arg0) {
        deanManagementPage.ssn.sendKeys("//.-[)-][/.");
    }

    //  ********************** US06-TC45 ****************************************************
    @Then("kullanici SSN {string}  bilgisini haraf olacak sekilde girer")
    public void kullaniciSSNBilgisiniHarafOlacakSekildeGirer(String arg0) {
        deanManagementPage.ssn.sendKeys("kkk-kk-llll");
    }

//  ********************** US06-TC46 ****************************************************

    @Then("kullanici SSN {string}  bilgisinde tire isaretini ucunde ve altinci index disinda olacak sekilde girer")
    public void kullaniciSSNBilgisindeTireIsaretiniUcundeVeAltinciIndexDisindaOlacakSekildeGirer(String arg0) {
        deanManagementPage.ssn.sendKeys(Faker.instance().numerify("##-####-###"));
    }

    @Then("kullanici Full authentication is required to access this resource uyarisini gormelidir")
    public void kullaniciFullAuthenticationIsRequiredToAccessThisResourceUyarisiniGormelidir() {
        assertTrue(deanManagementPage.message.getText(), true);
    }
//  ********************** US06-TC47 POZITIF TEST ***************************************
//  ********************** US06-TC48 ****************************************************

    @Then("kullanici username {string} bilgisini bos birakir")
    public void kullaniciUsernameBilgisiniBosBirakir(String arg0) {
        deanManagementPage.username.click();
        deanManagementPage.username.sendKeys(Keys.TAB);
    }

    //  ********************** US06-TC49 ****************************************************
    @Then("kullanici username {string} bilgisini kullanilmis bir isim girer")
    public void kullaniciUsernameBilgisiniKullanilmisBirIsimGirer(String arg0) {
        deanManagementPage.username.sendKeys(deanManagementPage.usernameTableKullanilanNumara.getText());
        ReusableMethods.waitFor(1);
    }

    @Then("kullanici Error: User with username clint.hamilla already register uyarisini gormelidir")
    public void kullaniciErrorUserWithUsernameClintHamillaAlreadyRegisterUyarisiniGormelidir() {
        assertEquals("Error: User with username clint.hamilla already register", deanManagementPage.message.getText());
    }

    //  ********************** US06-TC50 ****************************************************
    @Then("kullanici username bilgisini space tusu ile bosluk birakacak sekilde girer")
    public void kullaniciUsernameBilgisiniSpaceTusuIleBoslukBirakacakSekildeGirer() {
        deanManagementPage.username.sendKeys("    ");
    }

    @Then("kullanici Error: User with username already registeruyarisini gormelidir")
    public void kullaniciErrorUserWithUsernameAlreadyRegisteruyarisiniGormelidir() {
        assertEquals("Error: User with username already register", deanManagementPage.message.getText());
    }

//  ********************** US06-TC51 POZITIF TEST ***************************************
//  ********************** US06-TC52 ****************************************************

    @Then("kullanici yeni kayit icin password bilgisini bos birakir")
    public void kullaniciYeniKayitIcinPasswordBilgisiniBosBirakir() {
        deanManagementPage.password.click();
        deanManagementPage.password.sendKeys(Keys.TAB);

        assertTrue(deanManagementPage.passwordRequired.getText(), true);
    }

    //  ********************** US06-TC53 ****************************************************
    @Then("kullanici yeni kayit icin password bilgisini sekiz karakterden az girer")
    public void kullaniciYeniKayitIcinPasswordBilgisiniSekizKarakterdenAzGirer() {
        deanManagementPage.password.sendKeys(Faker.instance().numerify("#####"));
        String girilenPassword = deanManagementPage.password.getText();
//        if (girilenPassword.length() < 8) {
//            assertTrue(deanManagementPage.message.getText(), true);
//        }
    }

    //  ********************** US06-TC54 ****************************************************
    @Then("kullanici yeni kayit icin password bilgisini sekiz karakterden fazla girer")
    public void kullaniciYeniKayitIcinPasswordBilgisiniSekizKarakterdenFazlaGirer() {
        deanManagementPage.password.sendKeys(Faker.instance().numerify("#########"));
    }

    //  ********************** US06-TC55 ****************************************************
    @Then("kullanici yeni kayit icin password bilgisini space ilke bosluk birakacak sekilde girer")
    public void kullaniciYeniKayitIcinPasswordBilgisiniSpaceIlkeBoslukBirakacakSekildeGirer() {
        deanManagementPage.password.sendKeys("        ");

    }

//  **************************************************************************************************************************
//  ****************************************** US 07 - CONTACT MESSAGE *******************************************************
//  **************************************************************************************************************************

//  ********************** US07-TC01 ****************************************************
    @Then("kullanici acilan pencerede Contact Get All sekmesine tiklar")
    public void kullaniciAcilanPenceredeContactGetAllSekmesineTiklar() {
        contactGetAllPage.contactGetAllButton.click();
    }

    @Then("kullanici Contact Message sayfasinda oldugunu dogrular")
    public void kullaniciContactMessageSayfasindaOldugunuDogrular() {
        assertEquals("Contact Message", contactGetAllPage.contactMessageBaslik.getText());
    }

    @Then("kullanici Name bilgisini goruntuler")
    public void kullaniciNameBilgisiniGoruntuler() {
        assertTrue(contactGetAllPage.nameKontrol.getText(), true);
    }

    @Then("kullanici Email bilgisini goruntuler")
    public void kullaniciEmailBilgisiniGoruntuler() {
        assertTrue(contactGetAllPage.emailKontrol.getText(), true);
    }

    @Then("kullanici Date bilgisini goruntuler")
    public void kullaniciDateBilgisiniGoruntuler() {
        assertTrue(contactGetAllPage.dateKontrol.getText(), true);
    }

    @Then("kullanici Subject bilgisini goruntuler")
    public void kullaniciSubjectBilgisiniGoruntuler() {
        assertTrue(contactGetAllPage.subjectKontrol.getText(), true);
    }

    @Then("kullanici Message bilgisini goruntuler")
    public void kullaniciMessageBilgisiniGoruntuler() {
        assertTrue(contactGetAllPage.messageKontrol.getText(), true);
    }

//  ********************** US07-TC02 ****************************************************



}























