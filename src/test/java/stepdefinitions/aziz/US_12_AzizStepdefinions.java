package stepdefinitions.aziz;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminManagementPage;
import pages.HomePage;
import pages.LessonManagementPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class US_12_AzizStepdefinions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    LessonManagementPage lessonManagementPage = new LessonManagementPage();



    public static int lessonNumber = Faker.instance().number().numberBetween(1,1000);


    @Given("Kullanici {string}  gider*")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("page_url"));

    }

    @When("Kullanici login butonuna tiklar*")
    public void kullanici_login_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        homePage.loginButton.click();
    }

    @When("Kullanici User Name alanina username girer*")
    public void kullanici_user_name_alanina_username_girer() {
        ReusableMethods.waitFor(1);
        loginPage.username.sendKeys(ConfigReader.getProperty("aziz_vice_dean_username"));
    }

    @When("Kullanici Password alanina password girer*")
    public void kullanici_password_alanina_password_girer() {
        ReusableMethods.waitFor(1);
        loginPage.password.sendKeys(ConfigReader.getProperty("aziz_vice_dean_password"));
    }

    @When("Kullanici login sekmesine tiklar*")
    public void kullanici_login_sekmesine_tiklar() {
        ReusableMethods.waitFor(1);
        loginPage.loginButton.click();
    }

    @When("Kullanici lesson sayfasini gorur*")
    public void kullanici_lesson_sayfasini_gorur() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

    @When("Kullanici Menu tiklar*")
    public void kullanici_menu_tiklar() {
        ReusableMethods.waitFor(1);
        adminManagementPage.menuButton.click();
    }

    @When("Kullanici Main Menuden Lesson Management tiklar*")
    public void kullanici_main_menuden_lesson_management_tiklar() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.lessonManagement.click();
    }

    @When("Kullanici Lesson Program butonuna tiklar*")
    public void kullanici_lesson_program_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.lessonProgramButton.click();


    }

    @When("Kullanici Choose Lessons tan bir ders secer*")
    public void kullanici_choose_lessons_tan_bir_ders_secer() {

        lessonManagementPage.chooseLessons.click();
        ReusableMethods.waitFor(2);
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys("Nezaket Kurallari", Keys.ENTER).perform();

    }

    @When("Kullanici Choose Education Term donem secer*")
    public void kullanici_choose_education_term_donem_secer() {
        ReusableMethods.waitFor(1);
        Select select = new Select(lessonManagementPage.lessonProgramChooseEducationTerm);
        select.selectByVisibleText("FALL_SEMESTER");
    }

    @When("Kullanici Choose Day bir gun secer*")
    public void kullanici_choose_day_bir_gun_secer() {
        ReusableMethods.waitFor(1);
        Select select = new Select(lessonManagementPage.chooseDay);
        select.selectByVisibleText("MONDAY");
    }

    @When("Kullanici Start Time bir saat girer*")
    public void kullanici_start_time_bir_saat_girer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.startTime.sendKeys("10001");
    }

    @When("Kullanici Stop Time bir saat girer*")
    public void kullanici_stop_time_bir_saat_girer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.stopTime.sendKeys("11001");
    }

    @When("Kullanici Submit butonuna tiklar*")
    public void kullanici_submit_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(lessonManagementPage.lessonProgramFirstSubmit);
    }

    @When("Kullanici Created Lesson Program mesajini gorur*")
    public void kullanici_created_lesson_program_mesajini_gorur() throws IOException {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.createdLessonProgramMesaji.isDisplayed());

    }

    @When("Kullanici Lesson Program List tablosunda olusturdugu Ders programini gorur*")
    public void kullanici_lesson_program_list_tablosunda_olusturdugu_ders_programini_gorur() {

    }

    @When("Kullanici Choose Lessons alanini bos birakir*")
    public void kullaniciChooseLessonsAlaniniBosBirakir() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.chooseLessons.click();

    }

    @And("Kullanici Created Ekranda uyari mesajini gorur*")
    public void kullaniciCreatedEkrandaUyariMesajiniGorur() throws IOException {
        ReusableMethods.waitFor(1);
        lessonManagementPage.hataUyariMesaji.isDisplayed();

    }

    @When("Kullanici Lessons butonuna tiklar*")
    public void kullaniciLessonsButonunaTiklar() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.lessonsButton.click();
    }

    @When("Kullanici Lesson Name alanina isim girer*")
    public void kullaniciLessonNameAlaninaIsimGirer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.lessonName.sendKeys("Nezaket Kurallari -" + lessonNumber);
    }



    @When("Kullanici Credit Score alanina kredi notu girer*")
    public void kullaniciCreditScoreAlaninaKrediNotuGirer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.creditScore.sendKeys("10");
    }

    @When("Kullanici Lesson Submit butonuna tiklar*")
    public void kullaniciLessonSubmitButonunaTiklar() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.lessonSubmitButton.click();
    }

    @When("Kullanici Lesson Created mesajini gorur*")
    public void kullaniciLessonCreatedMesajiniGorur() throws IOException {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(lessonManagementPage.createdLessonMesaji.isDisplayed());
    }

    @When("Kullanici Lesson List tablosunda Olusturdugu dersi gorur*")
    public void kullaniciLessonListTablosundaOlusturduguDersiGorur() {
        ReusableMethods.clickByJS(lessonManagementPage.lessonListLastPage);
        ReusableMethods.waitFor(2);
        List<WebElement> lessonListTablo = Driver.getDriver().
                findElements(By.xpath("(//*[@class=\"table table-striped table-bordered table-hover\"])[2]//tbody//tr//td[1]"));
        List<String> lessonList = new ArrayList<>();
        for(WebElement w : lessonListTablo){
           lessonList.add(w.getText());
        }
        System.out.println("lessonList = " + lessonList);
       Assert.assertTrue(lessonList.get(lessonList.size()-1).contains("Nezaket Kurallari"));
    }



    @When("Kullanici Credit Score alanina String bir veri girer*")
    public void kullaniciCreditScoreAlaninaStringBirVeriGirer() {
        ReusableMethods.waitFor(1);
        lessonManagementPage.creditScore.sendKeys("stringolurmu");

    }

    @And("Kullanici Hata mesajini gorur*")
    public void kullaniciHataMesajiniGorur() throws IOException {
        ReusableMethods.waitFor(1);
       Assert.assertTrue(lessonManagementPage.hataUyariMesaji.isDisplayed());
    }

    @And("Kullanici sayfayi kapatir*")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @When("Kullanici Lesson Program Assignment tablosundaki Olusturdugu Ders Programinin bulundugu Checkbox tiklar*")
    public void kullaniciLessonProgramAssignmentTablosundakiOlusturduguDersProgramininBulunduguCheckboxTiklar() {
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollIntoViewJS(lessonManagementPage.lessonCheckBox);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(lessonManagementPage.lessonCheckBox);

    }

    @When("Kullanici Choose Teacher Drapdowndan Sisteme Kayitli Teacheri secer*")
    public void kullaniciChooseTeacherDrapdowndanSistemeKayitliTeacheriSecer() {
        ReusableMethods.scrollIntoViewJS(lessonManagementPage.selectTeacher);
        ReusableMethods.waitFor(2);
        Select select = new Select(lessonManagementPage.selectTeacher);
        select.selectByVisibleText("monte kristo");
        ReusableMethods.waitFor(2);

    }

    @When("Kullanici Lesson Submit Second butonuna tiklar*")
    public void kullaniciLessonSubmitSecondButonunaTiklar() {
        ReusableMethods.scrollIntoViewJS(lessonManagementPage.lessonProgramSecondSubmit);
        ReusableMethods.clickByJS(lessonManagementPage.lessonProgramSecondSubmit);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici Lesson added to Teacher mesajini gorur*")
    public void kullaniciLessonAddedToTeacherMesajiniGorur() throws IOException {
        ReusableMethods.takeScreenShotOfPage();
    }


}
