package Pages;

import Utils.Utils;
import org.openqa.selenium.WebDriver;

import static Locators.MakeAppointment.*;


public class MakeAppointmentPages extends BasePage {
    Utils utils = new Utils();

    public MakeAppointmentPages(WebDriver driver) {
        super(driver);
    }

    public void makeAppointment(int index, String str) {
        click(FULFILLFROM_FACILTY);
        click(FULFILLFORM_DROPDOWN(str));
        click(FULFILLFORM_CHECKBOX);
        click(FULFILLFROM_FACILYTY_RADIO(index));
        setTextInformation(FULFILLFROM_DATE, utils.getToday());
        setTextInformation(FULFILLFORM_COMMENT, "abc");
        click(FULFILLFROM_SUBMIT);
    }

}
