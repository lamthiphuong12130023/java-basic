package Pages;

import org.openqa.selenium.WebDriver;

import static Locators.FulFillFromLocator.*;


public class FulFillFromPages extends BasePage {

    public FulFillFromPages(WebDriver driver) {
        super(driver);
    }

    public void fulfillForm(int index, String str) {
        click(FULFILLFROM_FACILTY);
        click(FULFILLFORM_DROPDOWN(str));
        click(FULFILLFORM_CHECKBOX);
        click(FULFILLFROM_FACILYTY_RADIO(index));
        setTextInformation(FULFILLFROM_DATE, getToday());
        setTextInformation(FULFILLFORM_COMMENT, "abc");
        click(FULFILLFROM_SUBMIT);
    }

}
