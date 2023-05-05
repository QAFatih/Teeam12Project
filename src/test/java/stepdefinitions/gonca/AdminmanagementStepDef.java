package stepdefinitions.gonca;

import io.cucumber.java.en.*;
import pages.AdminManagementPage;
import pages.DeanManagementPage;
import pages.LoginPage;
import pages.ViceDeanManagementPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdminmanagementStepDef {

    LoginPage loginPage = new LoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();

    ViceDeanManagementPage deanManagementPage = new ViceDeanManagementPage();

    @Then("kullanici admin icin username\"User Name\" bilgisi girer")
    public void kullanici_admin_icin_username_user_name_bilgisi_girer() {
        loginPage.username.sendKeys("AdminGonca");
    }
    @Then("kullanici admin icin password {string} bilgisi girer")
    public void kullanici_admin_icin_password_bilgisi_girer(String string) {
        loginPage.password.sendKeys("12345678");
    }
    @Then("kullanici Admin Management sayfasinda oldugunu dogrular")
    public void kullanici_admin_management_sayfasinda_oldugunu_dogrular() {
        assertEquals("Admin Management", adminManagementPage.adminManagementSayfaDogrulama.getText());
    }
    @Then("kullanici Menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {
        adminManagementPage.menuButton.click();
        ReusableMethods.waitFor(1);
    }
    @Then("kullanici acilan pencerede Vice Dean Management sekmesine tiklar")
    public void kullanici_acilan_pencerede_vice_dean_management_sekmesine_tiklar() {
        adminManagementPage.viceDeanManagement.click();
        ReusableMethods.waitFor(1);
    }
//
//    @Then("kullanici Full authentication is required to access this resource uyarisini gorur")
//    public void kullaniciFullAuthenticationIsRequiredToAccessThisResourceUyarisiniGorur() {
//        assertEquals("Full authentication is required to access this resource", deanManagementPage.fullAuthenticationUyarisi.getText());
//    }
}
