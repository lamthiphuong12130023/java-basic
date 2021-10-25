package Locators;

import org.openqa.selenium.By;

public class FulFillFromLocator {

    static String local = "//div[@class='col-sm-4']";

    public static By FULFILLFROM_FACILTY = By.id("combo_facility");

    public static By FULFILLFORM_DROPDOWN(String string) {
        return By.xpath(local + "//option[text()='" + string + "']");
    }

    public static By FULFILLFROM_DATE = By.id("txt_visit_date");

    public static By FULFILLFROM_SUBMIT = By.xpath("//button[@id='btn-book-appointment']");

    public static By FULFILLFORM_COMMENT = By.xpath("//textarea[@id='txt_comment']");

    public static By FULFILLFORM_CHECKBOX = By.xpath("//div[@class='form-group']//input[@type='checkbox']");

    //  public static By FULFILLFORM_CALENDER = By.xpath("//div[@class='input-group-addon']");

    public static By FULFILLFROM_FACILYTY_RADIO(int index) {
        return By.xpath("(//div[@class='col-sm-4']//input[@type='radio'])[" + index + "]");
    }
}
