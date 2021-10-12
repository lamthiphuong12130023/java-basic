package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW {
    public static ChromeDriver driver = null;

    public static void main(String[] args) {
        /*
        TC 01#: User can login with valid credentials.

        Steps:
        1. Navigate to https://www.saucedemo.com/
        2. Enter 'standard_user' into username field
        3. Enter 'secret_sauce' into password field
        4. Click Login button

        Expected:
        1. User can login.
        2. The URL https://www.saucedemo.com/inventory.html is navigated.
        3. The 'PRODUCTS' label displays.
         */
        driver = new ChromeDriver();
//        login("standard_user", "secret_sauce");
//        login("locked_out_user", "secret_sauce");
//        login("problem_user", "secret_sauce");
//        login("performance_glitch_user", "secret_sauce");

        Account standard_acc = new Account("standard_user", "secret_sauce");
//        standard_acc.setUsername("standard_user");
//        standard_acc.setPassword("secret_sauce");

        login(standard_acc);
//        driver.quit();
//        driver.close();
//        String [] str = {"add-to-cart-sauce-labs-backpack","add-to-cart-sauce-labs-bike-light",
//                "add-to-cart-sauce-labs-bolt-t-shirt","add-to-cart-sauce-labs-fleece-jacket","add-to-cart-sauce-labs-onesie",
//                "add-to-cart-test.allthethings()-t-shirt-(red)"};
//
//        for (String string : str){
//            clickbutton(string);
//        }
        clickbutton("add-to-cart-sauce-labs-backpack");
        clickbutton("add-to-cart-sauce-labs-bike-light");
        clickbutton("add-to-cart-sauce-labs-bolt-t-shirt");
        clickbutton("add-to-cart-sauce-labs-fleece-jacket");
        clickbutton("add-to-cart-sauce-labs-onesie");
        clickbutton("add-to-cart-test.allthethings()-t-shirt-(red)");
    }

    public static void login(String username, String password) {
        driver.get("https://www.saucedemo.com/");
        WebElement input_username = driver.findElement(By.id("user-name"));
        input_username.sendKeys(username);

        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys(password);

        WebElement button_login = driver.findElement(By.id("login-button"));
        button_login.click();
    }

    public static void login(Account account) {
        driver.get("https://www.saucedemo.com/");
        WebElement input_username = driver.findElement(By.id("user-name"));
        input_username.sendKeys(account.getUsername());

        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys(account.getPassword());

        WebElement button_login = driver.findElement(By.id("login-button"));
        button_login.click();
    }

    public static void clickbutton(String str) {
        driver.get("https://www.saucedemo.com/inventory.html");
        WebElement button_cart = driver.findElement(By.id(str));
        button_cart.click();

//        WebElement button_cart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
//        WebElement button_cart1 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
//        WebElement button_cart2 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
//        WebElement button_cart3 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
//        WebElement button_cart4 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
//        WebElement button_cart5 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));


//        button_cart1.click();
//        button_cart2.click();
//        button_cart3.click();
//        button_cart4.click();
//        button_cart5.click();

    }

}
