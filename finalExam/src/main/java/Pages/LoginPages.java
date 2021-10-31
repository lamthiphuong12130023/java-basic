package Pages;

import Objects.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Locators.LoginLocator.*;
import static Utils.Constants.URL_WEB;

public class LoginPages extends BasePage {

    public LoginPages(WebDriver driver) {
        super(driver);
    }

    public void loginSuccess(Account account) {
        navigate();
        setTextInformation(INPUT_USERNAME, account.getUsername());
        setTextInformation(INPUT_PASSWORD,account.getPassword());
        click(LOGIN_BUTTON);
    }

    public void navigate() {
        driver.get(URL_WEB);
        click(NAVIGATE);
    }
}
