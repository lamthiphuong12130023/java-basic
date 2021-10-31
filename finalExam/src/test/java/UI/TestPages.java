package UI;

import Data.Data;
import Objects.Account;
import Objects.MakeAppointment;
import Pages.BasePage;
import Pages.MakeAppointmentPages;
import Pages.LoginPages;
import Pages.AppointmentConfirmationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class TestPages {
    WebDriver driver;
    BasePage basePage;
    LoginPages loginPages;
    MakeAppointmentPages fulFillFromPages;
    AppointmentConfirmationPage verifyPage;

    @BeforeClass
    public void SetUp() {
        basePage = new BasePage(driver);
        driver = basePage.webDriver("chrome");
        loginPages = new LoginPages(driver);
        fulFillFromPages = new MakeAppointmentPages(driver);
        verifyPage = new AppointmentConfirmationPage(driver);

    }

    @org.testng.annotations.Test(priority = 1)
    public void Test() {
        Account account = Data.getDataAccount();
        loginPages.loginSuccess(account);
    }

    @org.testng.annotations.Test(priority = 2)
    public void testMakeAppointment() {

        fulFillFromPages.makeAppointment(2, "Hongkong CURA Healthcare Center");
    }

    @org.testng.annotations.Test(priority = 3)
    public void testVerifyMakeAppointment() {
        ArrayList<MakeAppointment> expectedFormFill = Data.getMakeAppointment();
        ArrayList<MakeAppointment> actualFormFill = verifyPage.getMakeAppointmentItems();

        verifyPage.compareMakeAppointment(actualFormFill, expectedFormFill);

    }
    public void terDown(){

    }
}


