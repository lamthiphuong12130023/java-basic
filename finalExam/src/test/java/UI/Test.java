package UI;

import Data.Data;
import Objects.Account;
import Objects.FormFill;
import Pages.BasePage;
import Pages.FulFillFromPages;
import Pages.LoginPages;
import Pages.VerifyPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;


public class Test {
    WebDriver driver;
    BasePage basePage;
    LoginPages loginPages;
    FulFillFromPages fulFillFromPages;
    VerifyPage verifyPage;

    @BeforeClass
    public void SetUp() {
        basePage = new BasePage(driver);
        driver = basePage.webDriver("chrome");
        loginPages = new LoginPages(driver);
        fulFillFromPages = new FulFillFromPages(driver);
        verifyPage = new VerifyPage(driver);

    }

    @org.testng.annotations.Test(priority = 1)
    public void Test() {
        Account account = Data.getDataAccount();
        loginPages.loginSuccess(account);
    }

    @org.testng.annotations.Test(priority = 2)
    public void testFulFill() {
        fulFillFromPages.fulfillForm(2, "Hongkong CURA Healthcare Center");
    }

    @org.testng.annotations.Test(priority = 3)
    public void testVerifyFormFill() {
        ArrayList<FormFill> expectedFormFill = Data.getFormFill();
        ArrayList<FormFill> actualFormFill = verifyPage.getFormFillItems();

        verifyPage.compareFulFillForm(actualFormFill, expectedFormFill);

    }
}


