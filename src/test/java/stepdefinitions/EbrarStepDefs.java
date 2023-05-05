package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LessonManagementPage;
import pages.LoginPage;
import pages.ViceDeanManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class EbrarStepDefs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();

    LessonManagementPage lessonManagementPage = new LessonManagementPage();

    @Given("Kullanici anasayfaya {string} gider..")
    public void kullaniciAnasayfayaGider(String url) {
        Driver.getDriver().get(url);
    }

    @When("Login butonuna tiklar..")
    public void loginButonunaTiklar() {
        homePage.loginButton.click();
    }

    @And("Username {string} girer..")
    public void usernameGirer(String username) {
        loginPage.username.sendKeys(username);
    }

    @And("Password {string} girer..")
    public void passwordGirer(String password) {
        loginPage.password.sendKeys(password);
    }

    @And("Ikinci login butonuna tiklar..")
    public void ikinciLoginButonunaTiklar() {
        loginPage.loginButton.click();
    }

    @Then("Lesson Program a tiklar..")
    public void lessonProgramATiklar() {
        viceDeanManagementPage.lessonProgramButton.click();
    }

    @And("Ders {string} secer..")
    public void dersSecer(String ders) {
        WebElement el = lessonManagementPage.chooseLessons;
        Actions actions = new Actions(Driver.getDriver());
        actions.click(el).sendKeys(ders,Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);
    }

    @And("Ders icin donem {string} secer..")
    public void dersIcinDonemSecer(String donem) {
        Select select = new Select(lessonManagementPage.lessonProgramChooseEducationTerm);
        select.selectByVisibleText(donem);
    }

    @And("Ders icin gun {string} secer..")
    public void dersIcinGunSecer(String gun) {
        Select select = new Select(lessonManagementPage.chooseDay);
        select.selectByVisibleText(gun);
    }

    @And("Dersin baslama saatini {string} secer..")
    public void dersinBaslamaSaatiniSecer(String baslamaSaati) {
        lessonManagementPage.startTime.sendKeys(baslamaSaati);
    }


    @And("Dersin bitis saatini {string} secer..")
    public void dersinBitisSaatiniSecer(String bitisSaati) {
        lessonManagementPage.stopTime.sendKeys(bitisSaati);
    }

    @Then("Submit tusuna basar..")
    public void submitTusunaBasar() {
        ReusableMethods.clickByJS(lessonManagementPage.lessonProgramFirstSubmit);

    }


    @Then("Bitis saatinin altindaki Required yazisini gorur..")
    public void BitisSaatininAltindakiRequiredYazisiniGorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(lessonManagementPage.stopTimeRequired.isDisplayed());
    }

    @Then("Baslama saatinin altindaki Required yazisini gorur..")
    public void BaslamaSaatininAltindakiRequiredYazisiniGorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(lessonManagementPage.startTimeRequired.isDisplayed());
    }


    @Then("{string} mesajini gorur..")
    public void mesajiniGorur(String mesaj) {
        ReusableMethods.waitFor(1);
        String expected = mesaj;
        String actual = lessonManagementPage.message.getText();
        Assert.assertEquals(expected,actual);
    }
}
