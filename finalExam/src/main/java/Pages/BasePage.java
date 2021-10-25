package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public WebDriver webDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = (WebDriver) new FirefoxFilter();
        }
        return driver;
    }

    /**
     * Take the information
     * @param by
     * @return element.getText();
     */
    public String getTextInformation(By by) {
        WebElement element = driver.findElement(by);
        element.clear();
        return element.getText();
    }

    /**
     * fill out the form username/ password
     * @param by
     * @param text
     */
    public void setTextInformation(By by, String text){
        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(text);
    }

    public String setInformation(By by){
        WebElement element = driver.findElement(by);

        return element.getText();
    }
    /**
     * click the button
     * @param by
     */
    public void click(By by) {
        WebElement element = driver.findElement(by);
        element.click();

    }

    /**
     * take today with format=dd/MM/yyyy
     * @return String(date)
     */
    public String getToday(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);
        return strDate;
    }


    public int getElementsSize(By by) {
        int result = 0;
        try {
            List<WebElement> elementList = driver.findElements(by);
            result = elementList.size();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
