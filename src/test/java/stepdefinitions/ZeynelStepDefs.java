package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class ZeynelStepDefs {

    Actions actions=new Actions(Driver.getDriver());

    Faker faker=new Faker();

    public static String email= Faker.instance().internet().emailAddress();
    public static String name=Faker.instance().name().firstName();
    public static String surname=Faker.instance().name().lastName();
    public static String birthplace=Faker.instance().country().capital();
    public static String dateofbirth=Faker.instance().numerify("15.07.2015");
    public static String dateofbirth1=Faker.instance().numerify("15.07.2033");


    public static String username=Faker.instance().name().username();

    public static String password=Faker.instance().numerify("122345678");


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    StudentManagementPage studentManagementPage=new StudentManagementPage();

    AdminManagementPage adminManagementPage = new AdminManagementPage();

    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();

    @Given("Kullanici anasayfaya gider...")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("page_url"));
    }

    @When("Kullanici login butonuna tiklar...")
    public void kullanici_login_butonuna_tiklar() {
        homePage.loginButton.click();
    }

    @When("Kullanici Username alanina username girer...")
    public void kullanici_username_alanina_username_girer() {
        loginPage.username.sendKeys(ConfigReader.getProperty("zeynel_vicedean_username"));
    }

    @When("Kullanici password alanini password girer...")
    public void kullanici_password_alanini_password_girer() {
        loginPage.password.sendKeys(ConfigReader.getProperty("zeynel_vicedean_password"));
    }

    @When("Kullanici iclogine tiklar...")
    public void kullanici_iclogine_tiklar() {
        ReusableMethods.clickByJS(loginPage.loginButton);
    }

    @When("kullanici lesson sayfasini gorur...")
    public void kullanici_lesson_sayfasini_gorur() throws IOException {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

    @When("Kullanici menu butonuna tiklar...")
    public void kullanici_menu_butonuna_tiklar() {
        adminManagementPage.menuButton.click();
        ReusableMethods.waitFor(3);
    }

    @When("Kullanici Teacher Management butonuna tiklar...")
    public void kullanici_teacher_management_butonuna_tiklar() {
        ReusableMethods.clickByJS(teacherManagementPage.teacherButton);
        ReusableMethods.waitFor(5);
    }

    @When("Kullanici teacher sayfasini girer...")
    public void kullanici_teacher_sayfasini_girer() throws IOException {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("teacher"));
    }

    @When("Kullanici teacher list tablosunda name surname,phone number,ssn,username verilerini gorur...")
    public void kullanici_teacher_list_tablosunda_name_surname_phone_number_ssn_username_verilerini_gorur() throws IOException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.getScreenshot(teacherManagementPage.teacherList.getText());
//us14 tc01 kismi
    }

    @When("Kullanici kayitli teacher gitmek icin sayfalari tiklar...")
    public void kullanici_kayitli_teacher_gitmek_icin_sayfalari_tiklar() {
       Actions actions=new Actions(Driver.getDriver());
       actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.clickByJS(teacherManagementPage.teachersayfatiklama);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(teacherManagementPage.teachersayfatiklama);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(teacherManagementPage.teachersayfatiklama);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(teacherManagementPage.teachersayfatiklama);

    }
    @When("Kullanici Teacher List deki edit butonuna tiklar...")
    public void kullanici_teacher_list_deki_edit_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(teacherManagementPage.temeledit);

    }
    @When("Kullanici choose lesson dan bir ders secer...")
    public void kullanici_choose_lesson_dan_bir_ders_secer() {
        teacherManagementPage.derssec.click();
        actions.sendKeys("LAZ TARIHINE GIRIS 1",Keys.ENTER).perform();

    }
    @When("Kullanici email adresini gunceller...")
    public void kullanici_email_adresini_gunceller() {
        ReusableMethods.waitFor(2);
        teacherManagementPage.birthplace.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(2);
        actions.sendKeys(email).perform();
        ReusableMethods.waitFor(2);


    }
    @When("Kullanici gender check boxindaki male tiklar...")
    public void kullanici_gender_check_boxindaki_male_tiklar() {
        teacherManagementPage.gendertikla.click();

    }
    @When("Kulanici password alanina passwordunu girer...")
    public void kulanici_password_alanina_passwordunu_girer() {
        teacherManagementPage.password.sendKeys("53535353");
    }
    @When("Kullanici submit butonuna tiklar...")
    public void kullanici_submit_butonuna_tiklar() {
        teacherManagementPage.submit.click();
        ReusableMethods.waitFor(2);

    }
    @When("Kullanici Teacher update Succesfull mesajini gorur...")
    public void kullanici_teacher_update_succesfull_mesajini_gorur() throws IOException {
        ReusableMethods.getScreenshot(teacherManagementPage.submit.getText());
    }
    //us14 tc01 kismi ustu
    @When("Kullanici choose lesson alanini bos birakir...")
    public void kullanici_choose_lesson_alanini_bos_birakir() {

    }
    @When("Kullanici guncelleme yapilamadigi ile ilgili bir mesaj gorur...")
    public void kullanici_guncelleme_yapilamadigi_ile_ilgili_bir_mesaj_gorur() throws IOException {
        ReusableMethods.getScreenshot(teacherManagementPage.submit.getText());
    }
    //us14 tc02 kismi ustu
    @When("Kullanici gender checkboxindaki male alanini bos birakir...")
    public void kullanici_gender_checkboxindaki_male_alanini_bos_birakir() {

    }
    //us14 tc03 kismi ustu
    @When("Kullanici invalid bir email girer...")
    public void kullanici_invalid_bir_email_girer() {
        ReusableMethods.waitFor(2);
        teacherManagementPage.birthplace.sendKeys(Keys.TAB);
        actions.sendKeys("abc@",Keys.ENTER).perform();
    }
    //us14 tc04 kismi ustu
    @When("Kullanici sayfayi kapatir...")
    public void kullanici_sayfayi_kapatir() {
       Driver.closeDriver();
    }
    //u14 tum test caseler


    //us15 baslangici tc01

    @When("Kullanici Student Management butonuna tiklar...")
    public void kullanici_student_management_butonuna_tiklar() {
        studentManagementPage.studentbutton.click();

    }
    @When("Kullanici student sayfasina girer...")
    public void kullanici_student_sayfasina_girer() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("student"));

    }
    @When("Kullanici Choose Advisor Teacher checkboxdan ogretmeni secer...")
    public void kullanici_choose_advisor_teacher_checkboxdan_ogretmeni_secer() {
       // studentManagementPage.adviserteacher.click();
        Select select=new Select(studentManagementPage.adviserteacher);
        select.selectByVisibleText("TEMEL DURSUN");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).perform();

    }
    @When("Kullanici name alanina name girer...")
    public void kullanici_name_alanina_name_girer() {
        actions.sendKeys(name,Keys.TAB).perform();

    }
    @When("Kullanici surname alanina surname girer...")
    public void kullanici_surname_alanina_surname_girer() {
        actions.sendKeys(surname,Keys.TAB).perform();

    }
    @When("Kullanici Birth Place alanina date girer...")
    public void kullanici_birth_place_alanina_date_girer() {
        actions.sendKeys(birthplace,Keys.TAB).perform();
    }
    @When("Kullanici Email alanina email girer...")
    public void kullanici_email_alanina_email_girer() {
        actions.sendKeys(email,Keys.TAB).perform();

    }
    @When("Kullanici Phone alanina phone girer...")
    public void kullanici_phone_alanina_phone_girer() {
        actions.sendKeys(faker.numerify("###-###-####"),Keys.TAB).perform();

    }
    @When("Kullanici Gender checkbox ina tiklar...")
    public void kullanici_gender_checkbox_ina_tiklar() {
        actions.sendKeys(Keys.ARROW_RIGHT,Keys.TAB).perform();

    }
    @When("Kullanici Date Of Birth alanina date girer...")
    public void kullanici_date_of_birth_alanina_date_girer() {
        actions.sendKeys(dateofbirth,Keys.TAB).perform();

    }
    @When("Kullanici Ssn alanina ssn girer...")
    public void kullanici_ssn_alanina_ssn_girer() {
        actions.sendKeys(faker.numerify("122-##-####"),Keys.TAB).perform();

    }
    @When("Kullanici User Name alanina username girer...")
    public void kullanici_user_name_alanina_username_girer() {
        actions.sendKeys(username,Keys.TAB).perform();

    }
    @When("Kullanici Father Name alanina fathername girer...")
    public void kullanici_father_name_alanina_fathername_girer() {
        actions.sendKeys(name,Keys.TAB).perform();

    }
    @When("Kullanici Mather Name alanina mathername girer...")
    public void kullanici_mather_name_alanina_mathername_girer() {
        actions.sendKeys(name,Keys.TAB).perform();

    }
    @When("Kullanici password alanina password girer...")
    public void kullanici_password_alanina_password_girer() {
        actions.sendKeys(faker.numerify("########"),Keys.TAB).perform();

    }
    @When("Kullanici student submit butonuna tiklar...")
    public void kullanici_student_submit_butonuna_tiklar() {
        ReusableMethods.clickByJS(studentManagementPage.studentsubmit);


    }
    @When("Kullanici student list tablosunda olusturdugu student in oldugunu gorur...")
    public void kullanici_student_list_tablosunda_olusturdugu_student_in_oldugunu_gorur() throws IOException {
        actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB).perform();
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(studentManagementPage.sonsayfatiklama);
        ReusableMethods.waitFor(2);

        List<WebElement> studentListTablo = Driver.getDriver().findElements(By.xpath("//table[@class=\"table table-striped table-bordered table-hover\"]//tbody//tr//td[2]"));
        for (WebElement w:studentListTablo){
            System.out.println("w.getText() = " + w.getText());

            Assert.assertTrue(w.getText().contains(studentManagementPage.name.getText()));
        }


        }





    //us15 tc02
    @When("Kullanici Date Of Birth alanina var olunan zamandan ileri bir tarih girer...")
    public void kullanici_date_of_birth_alanina_var_olunan_zamandan_ileri_bir_tarih_girer() {
        actions.sendKeys(dateofbirth1,Keys.TAB).perform();

    }
    @When("Kullanici gecmis bir tarih olmali  mesajini gorur...")
    public void kullanici_gecmis_bir_tarih_olmali_mesajini_gorur() throws IOException {
    Assert.assertTrue(studentManagementPage.alertgecmistarihmesaji.isDisplayed());
    ReusableMethods.waitForVisibility(studentManagementPage.alertgecmistarihmesaji,3);

    }

    //us15 tc03
    @When("Kullanici Choose Advisor Teacher checkboxdan ogretmeni secmez...")
    public void kullanici_choose_advisor_teacher_checkboxdan_ogretmeni_secmez() {
        studentManagementPage.adviserteacher.click();
        actions.sendKeys("Choose Teacher",Keys.ENTER,Keys.TAB).perform();

    }
    @When("Kullanici please select advisor teacher mesajini gorur...")
    public void kullanici_please_select_advisor_teacher_mesajini_gorur() throws IOException {
       Assert.assertTrue(studentManagementPage.advisoralertmesaji.isDisplayed());
       ReusableMethods.waitFor(2);


    }
    //us15 tc04
    @When("Kullanici Email alanina invalid email girer...")
    public void kullanici_email_alanina_invalid_email_girer() {
        actions.sendKeys("abc@",Keys.TAB).perform();


    }
    @When("Kullanici invalid email uyarisini gorur...")
    public void kullanici_invalid_email_uyarisini_gorur() throws IOException {
        Assert.assertTrue(studentManagementPage.invalidemailmesaji.isDisplayed());



    }

    //us25 tc01
    @When("Kullanici Admin Username alanina username girer...")
    public void kullanici_admin_username_alanina_username_girer() {
        loginPage.username.sendKeys(ConfigReader.getProperty("zeynel_admin_username"));
    }
    @When("Kullanici Admin password alanini password girer...")
    public void kullanici_admin_password_alanini_password_girer() {
        loginPage.password.sendKeys(ConfigReader.getProperty("zeynel_admin_password"));

    }








}
















