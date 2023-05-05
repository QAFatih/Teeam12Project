package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.StudentInfoManagementPage;
import utilities.ReusableMethods;

public class AlperStepDefs {

    StudentInfoManagementPage studentInfoManagementPage = new StudentInfoManagementPage();


    @Then("Student Managment sayfasinda oldugunu dogrular.")
    public void student_managment_sayfasinda_oldugunu_dogrular() {
        String expectedBaslik = "Student Info Management";
        String actualBaslik = studentInfoManagementPage.studentInfoBaslik.getText();
        Assert.assertEquals(expectedBaslik, actualBaslik);
    }

    @When("Teacher Choose Lesson butonundan {string} secer")
    public void teacher_choose_lesson_butonundan_secer(String lesson) {
        Select select = new Select(studentInfoManagementPage.chooseLesson);
        select.selectByVisibleText(lesson);

    }

    @When("Teacher Choose Student butonundan {string} secer")
    public void teacher_choose_student_butonundan_secer(String student) {
        Select select = new Select(studentInfoManagementPage.chooseStudent);
        select.selectByVisibleText(student);

    }

    @When("Teacher Choose Education Term butonundan {string} secer")
    public void teacher_choose_education_term_butonundan_secer(String term) {
        Select select = new Select(studentInfoManagementPage.chooseEducationTerm);
        select.selectByVisibleText(term);

    }

    @When("Teacher Absentee butonuna {string} girer")
    public void teacher_absentee_butonuna_girer(String absentee) {
        studentInfoManagementPage.absentee.sendKeys(absentee);

    }

    @When("Teacher Midterm Exam butonuna {string} girer")
    public void teacher_midterm_exam_butonuna_girer(String midterm) {
        studentInfoManagementPage.midtermExam.sendKeys(midterm);


    }

    @When("Teacher Final Exam butonuna {string} girer")
    public void teacher_final_exam_butonuna_girer(String string) {
        studentInfoManagementPage.finalExam.sendKeys(string);


    }

    @When("Teacher Info Note butonuna {string} girer")
    public void teacher_info_note_butonuna_girer(String string) {
        studentInfoManagementPage.infoNote.sendKeys(string);


    }

    @When("Teacher submit butona tiklar")
    public void teacher_submit_butona_tiklar() {
        ReusableMethods.clickByJS(studentInfoManagementPage.submitTeacher);

    }

    @Then("{string} dogrulama mesajini görür")
    public void dogrulamaMesajiniGorur(String dogrulama) {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(dogrulama, studentInfoManagementPage.alert.getText());
    }

    @When("Teacher {string} Name Surname görür")
    public void teacherNameSurnameGorur(String name) {
        String actualName = studentInfoManagementPage.tabloLocate(1);
        Assert.assertEquals(name, actualName);
    }

    @And("Teacher {string} Lesson name görür")
    public void teacherLessonNameGorur(String lessonName) {
        String actualName = studentInfoManagementPage.tabloLocate(2);
        Assert.assertEquals(lessonName, actualName);
    }

    @And("Teacher {string} Absentee görür")
    public void teacherAbsenteeGorur(String absentee) {
        String actualName = studentInfoManagementPage.tabloLocate(3);
        Assert.assertEquals(absentee, actualName);

    }

    @And("Teacher {string} Midterm Exam görür")
    public void teacherMidtermExamGorur(String midterm) {
        String actualName = studentInfoManagementPage.tabloLocate(4);
        Assert.assertEquals(midterm, actualName);
    }

     @And("Teacher {string} Final Exam görür")
     public void teacherFinalExamGorur(String faynil) {
        String actualName = studentInfoManagementPage.tabloLocate(5);
        Assert.assertEquals(faynil, actualName);


     }


    @And("Teacher {string} Note görür")
    public void teacherNoteGorur(String note) {
        String actualName = studentInfoManagementPage.tabloLocate(6);
        Assert.assertEquals(note, actualName);
    }

    @And("Teacher {string} Info Note görür")
    public void teacherInfoNoteGorur(String infoNote) {
        String actualName = studentInfoManagementPage.tabloLocate(7);
        Assert.assertEquals(infoNote, actualName);
    }

    @And("Teacher {string} Average görür")
    public void teacherAverageGorur(String average) {
        String actualName = studentInfoManagementPage.tabloLocate(8);
        Assert.assertEquals(average, actualName);
    }





}
