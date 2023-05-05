package stepdefinitions.aziz;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AdminManagementPage;
import pages.LoginPage;
import pages.TeacherManagementPage;
import utilities.ConfigReader;

public class US_24_AzizStepdefinions {

    LoginPage loginPage = new LoginPage();

    AdminManagementPage adminManagementPage = new AdminManagementPage();
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();

    @When("Kullanici  User Name alanina Admin username girer*")
    public void kullanici_user_name_alanina_admin_username_girer() {
       loginPage.username.sendKeys(ConfigReader.getProperty("aziz_admin_username"));
    }
    @When("Kullanici Password alanina  Admin password girer*")
    public void kullanici_password_alanina_admin_password_girer() {
        loginPage.password.sendKeys(ConfigReader.getProperty("aziz_admin_password"));
    }
    @When("Kullanici Admin-management sayfasini gorur*")
    public void kullanici_admin_management_sayfasini_gorur() {
        adminManagementPage.adminManagementIsDisplayed.isDisplayed();
    }

    @When("Kullanici User Name alanina username+ girer*")
    public void kullaniciUserNameAlaninaUsernameGirer() {
        teacherManagementPage.teacherUserName.
                sendKeys(US_13_AzizStepdefinions.name);
    }

    @And("Kullanici teacher sayfasinda uyari mesajini gorur*")
    public void kullaniciTeacherSayfasindaUyariMesajiniGorur() {
        adminManagementPage.adminUyariMesaji.isDisplayed();
    }
}
