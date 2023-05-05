package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LessonManagementPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SaidStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    LessonManagementPage lessonManagementPage = new LessonManagementPage();
    @Given("User goes to the home page")
    public void user_goes_to_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("page_url"));
    }
    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
    homePage.loginButton.click();
    }
    @When("User enters user name")
    public void user_enters_user_name() {
    loginPage.username.sendKeys("ilhanlar");
    }
    @When("User enters user password")
    public void user_enters_user_password() {
    loginPage.password.sendKeys("ilhanlar");
    }
    @When("User clicks the login button2")
    public void user_clicks_the_login_button2() {
    loginPage.loginButton.click();
    }
    @Then("User clicks on the lessons button")
    public void user_clicks_on_the_lessons_button() {
    lessonManagementPage.lessonsButton.click();
    }
    @When("User enters a valid value in the lesson name text box, like {string}")
    public void user_enters_a_valid_value_in_the_lesson_name_text_box_like(String name) {
    lessonManagementPage.lessonName.sendKeys(name);
    }
    @When("User enters a valid value in the credit score text box, like {string}")
    public void user_enters_a_valid_value_in_the_credit_score_text_box_like(String creditScore) {
    lessonManagementPage.creditScore.sendKeys(creditScore);
    }
    @When("User clicks the submit button")
    public void user_clicks_the_submit_button() {
        ReusableMethods.clickByJS(lessonManagementPage.lessonSubmitButton);
    }

    @Then("User sees the message like {string}")
    public void userSeesTheMessageLike(String message) {
    }

    @And("User clicks on the compulsory button")
    public void userClicksOnTheCompulsoryButton() {
    lessonManagementPage.compulsory.click();
    }
}
