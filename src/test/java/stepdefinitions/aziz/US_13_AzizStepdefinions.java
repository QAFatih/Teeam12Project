package stepdefinitions.aziz;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TeacherManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class US_13_AzizStepdefinions {

    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();

    public static String name = Faker.instance().name().firstName();
    public static String surName = Faker.instance().name().lastName();
    public static String email = Faker.instance().internet().emailAddress();

    Faker faker = new Faker();


    @When("Kullanici  Teacher Management tiklar*")
    public void kullanici_teacher_management_tiklar() {
        teacherManagementPage.teacherButton.click();
    }

    @When("Kullanici Choose Lessons bir ders secer*")
    public void kullanici_choose_lessons_bir_ders_secer() {
        teacherManagementPage.teacherchooseLessons.click();
        ReusableMethods.waitFor(4);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys("Nezaket Kurallari", Keys.ENTER).release().perform();
        ReusableMethods.waitFor(2);
    }

    @When("Kullanici Name kismina isim girer*")
    public void kullanici_name_kismina_isim_girer() {
        teacherManagementPage.teacherName.sendKeys(name);
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Surname kismina surname girer*")
    public void kullanici_surname_kismina_surname_girer() {
        teacherManagementPage.teacherSurName.sendKeys(surName);
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Birth Place kismina  girer*")
    public void kullanici_birth_place_kismina_girer() {
        teacherManagementPage.teacherBirthPlace.sendKeys("USA");
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Email kismina email girer*")
    public void kullanici_email_kismina_email_girer() {
        teacherManagementPage.teacherEmail.sendKeys(email);
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Phone kismina phone girer*")
    public void kullanici_phone_kismina_phone_girer() {
        teacherManagementPage.teacherPhoneNumber.sendKeys(faker.numerify("###-###-####"));
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Gender checkbox tan bir veri secer*")
    public void kullanici_gender_checkbox_tan_bir_veri_secer() {
        teacherManagementPage.genderMale.click();
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Date Of Birth kismina tarih girer*")
    public void kullanici_date_of_birth_kismina_tarih_girer() {
        teacherManagementPage.teacherbirthDay.sendKeys("10.03.1985");
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Ssn kismina sss girer*")
    public void kullanici_ssn_kismina_sss_girer() {
        teacherManagementPage.teacherSsn.sendKeys(faker.numerify("120-##-####"));
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici  Teacher User Name alanina username girer*")
    public void kullanici_teacher_user_name_alanina_username_girer() {
        teacherManagementPage.teacherUserName.sendKeys(name);
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Teacher Password alanina password girer*")
    public void kullanici_teacher_password_alanina_password_girer() {
        teacherManagementPage.teacherPassword.sendKeys(faker.numerify("########") + "");
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Teacher Submit butonuna tiklar*")
    public void kullanici_teacher_submit_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(teacherManagementPage.teacherSubmitButon);
    }

    @When("Kullanici Teacher Saved Successfully mesajini gorur*")
    public void kullanici_teacher_saved_successfully_mesajini_gorur() throws IOException {
        Assert.assertTrue(teacherManagementPage.teacherSuccessfully.isDisplayed());

    }

    @When("Kullanici Teacher List tablosunda eklemis oldugu Teacherin oldugunu gorur*")
    public void kullanici_teacher_list_tablosunda_eklemis_oldugu_teacherin_oldugunu_gorur() {

        ReusableMethods.clickByJS(teacherManagementPage.teacherLastPage);
        ReusableMethods.waitFor(2);
        List<WebElement> teacherList = Driver.getDriver().
                findElements(By.xpath("//*[@class=\"table table-striped table-bordered table-hover\"]//tbody//tr//td[4]"));
        for(WebElement w : teacherList){
            System.out.println(w.getText());

            Assert.assertTrue(w.getText().contains(teacherManagementPage.teacherUserName.getText()));

        }

    }
    @When("Kullanici Date Of Birth kismina varolunan tarihten  ileri bir tarih girer*")
    public void kullaniciDateOfBirthKisminaVarolunanTarihtenIleriBirTarihGirer() {
        teacherManagementPage.teacherbirthDay.sendKeys("10.03.2030");
    }

    @And("Kullanici teacher sayfasinda gecmis bir tarih olmali mesajini gorur*")
    public void kullaniciTeacherSayfasindaGecmisBirTarihOlmaliMesajiniGorur() {
        Assert.assertTrue(teacherManagementPage.gecmisTarihOlmaliMesaji.isDisplayed());
    }

    @When("Kullanici Email kismina {string} email girer*")
    public void kullaniciEmailKisminaEmailGirer(String arg0) {
        teacherManagementPage.teacherEmail.sendKeys("monte");
    }

    @And("Kullanici teacher sayfasinda Please enter valid email mesajini gorur*")
    public void kullaniciTeacherSayfasindaPleaseEnterValidEmailMesajiniGorur() {
        Assert.assertTrue(teacherManagementPage.pleaseEnterValidEmailMesaji.isDisplayed());
    }

    @When("Kullanici Choose Lessons bos birakir*")
    public void kullaniciChooseLessonsBosBirakir() {
        teacherManagementPage.teacherchooseLessons.click();
        ReusableMethods.waitFor(1);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys("Nezaket Kurallari", Keys.ENTER).perform();
        ReusableMethods.waitFor(1);
        teacherManagementPage.chooseLessonsDelete.click();
    }

    @And("Kullanici teacher sayfasinda lessons must not empty mesajini gorur*")
    public void kullaniciTeacherSayfasindaLessonsMustNotEmptyMesajiniGorur() throws IOException {
        Assert.assertTrue(teacherManagementPage.teacherUyariMesaji.isDisplayed());
       ReusableMethods.takeScreenShotOfPage();

    }


}
