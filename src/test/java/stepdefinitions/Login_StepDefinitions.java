package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.Login_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class Login_StepDefinitions {

    Login_Page login_page = new Login_Page();
    BasePage basePage = new BasePage();

    @Given("The user logs in")
    public void the_user_logs_in() {
        login_page.kullaniciKodu.sendKeys(ConfigReader.getProperty("userName"));
        login_page.sifre.sendKeys(ConfigReader.getProperty("password"));
        login_page.webSifre.sendKeys(ConfigReader.getProperty("web_password"));
        login_page.clickButton.click();
    }

    @And("The user goes Create Surgery List page")
    public void theUserGoesCreateSurgeryListPage() {
        basePage.theUserGoesCreateSurgeryListPage();
    }

    @And("The user goes Operating Room Procedures page")
    public void theUserGoesOperatingRoomProceduresPage() {
        basePage.theUserGoesOperatingRoomProceduresPage();
    }

    @And("The user goes Doctor Operating Room Procedures page")
    public void theUserGoesDoctorOperatingRoomProceduresPage() {
        basePage.theUserGoesDoctorOperatingRoomProceduresPage();
    }

    @And("The user goes Surgical Supplies page")
    public void theUserGoesSurgicalSuppliesPage() {
        basePage.theUserGoesSurgicalSuppliesPage();
    }

    @And("The user goes Surgery Appointment page")
    public void theUserGoesSurgeryAppointmentPage() {
        basePage.theUserGoesSurgeryAppointmentPage();
    }
}
