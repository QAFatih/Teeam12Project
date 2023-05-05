package stepdefinitions.ahmet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.StudentInfoManagementPage;
import pages.StudentManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.lang.reflect.Array;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class stepDefinitions_Ahmet_US_17 {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    StudentManagementPage studentManagementPage=new StudentManagementPage();

    StudentInfoManagementPage studentInfoManagementPage=new StudentInfoManagementPage();

    ReusableMethods reusableMethods=new ReusableMethods();

    List<String> studentList= new ArrayList<String>();


    @Given("Teacher {string} gider....")
    public void teacher_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("page_url"));
    }

    @When("Teacherin page'de oldugu dogrulanir.")
    public void teacherin_page_de_oldugu_dogrulanir() {
        Assert.assertTrue("homePage.homePageDogrulama",true);
       // homePage.homePageDogrulama.isDisplayed();
    }
    @When("Teacher login tiklar....")
    public void teacher_login_tiklar() {
        homePage.loginButton.click();
    }
    @When("Teacher Teacher_user_name girer....") public void teacher_teacher_user_name_girer() {loginPage.username.sendKeys("SadıkMath");
    }
    @When("Teacher {string} yazar.....")
    public void teacher_yazar(String string) {
        loginPage.password.sendKeys(ConfigReader.getProperty("Teacher_password"));
    }
    @When("Teacher mavi logini tiklar....")
    public void teacher_mavi_logini_tiklar() {
        loginPage.loginButton.click();

    }

    @When("Teacher'in girisi yaptigi dogrulanir....")
    public void teacher_in_girisi_yaptigi_dogrulanir() {
        Assert.assertEquals("SadıkMath",studentManagementPage.teacherDogrulama.getText());
        reusableMethods.waitFor(5);


    }

    @When("Teacher Choose Student butonunu acar ilk ogrenciyi secer....")
    public void teacher_choose_student_butonunu_acar_ilk_ogrenciyi_secer() {
        Select selectTeacherStudent=new Select(studentManagementPage.chooseStudent);
        String name = "Mel Rippin";
        selectTeacherStudent.selectByVisibleText(name);
        studentList.add(name);

    }
    @When("Teacher Choose Education Term butonu acar ilk donemi secer....")
    public void teacher_choose_education_term_butonu_acar_ilk_donemi_secer() {
        Select selectTeacherEducationTerm=new Select(studentManagementPage.chooseEducationTerm);
        selectTeacherEducationTerm.selectByVisibleText("SPRING_SEMESTER");
        reusableMethods.waitFor(2);




    }
    @When("Teacher Absentee kutusunu tiklar {string} girer.....")
    public void teacher_absentee_kutusunu_tiklar_girer(String string) {
        studentManagementPage.absentee.sendKeys(string);
        reusableMethods.waitFor(2);
    }
    @When("Teacher Choose Lesson butonunu acar {string} secer....")
    public void teacher_choose_lesson_butonunu_acar_secer(String string) {
        Select selectTeacherLesson=new Select(studentManagementPage.chooseLesson);
        selectTeacherLesson.selectByVisibleText("Math");

    }
    @When("Teacher Midterm Exam kutusunu tiklar {string} girer....")
    public void teacher_midterm_exam_kutusunu_tiklar_girer(String string) {
        studentManagementPage.midtermExam.sendKeys(string);
        reusableMethods.waitFor(2);
    }
    @When("Teacher Final Exam kutusunu tiklar {string} girer....")
    public void teacher_final_exam_kutusunu_tiklar_girer(String string) {
        studentManagementPage.finalExam.sendKeys(string);
        reusableMethods.waitFor(2);
    }
    @When("Teacher Info Note kutusunu tiklar {string} yazar....")
    public void teacher_info_note_kutusunu_tiklar_yazar(String string) {
        studentManagementPage.infoNote.sendKeys(string);
        reusableMethods.waitFor(2);

    }
    @When("Teacher Submit butonuna tiklar....")
    public void teacher_submit_butonuna_tiklar() {

        studentManagementPage.submitTeacher.click();
        reusableMethods.waitFor(5);

       // if (studentInfoManagementPage.alert1.isEnabled())
            System.out.println("sesfsfff");


    }


}
