package Pages;

import Objects.MakeAppointment;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import static Locators.AppointmentConfirmation.*;

public class AppointmentConfirmationPage extends BasePage {
    public AppointmentConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public MakeAppointment getMakeAppointmentItem() {
        MakeAppointment formFill = new MakeAppointment();
        formFill.setFacility(setInformation(VERIRY_FACILITY));
        formFill.setCheckbox(setInformation(VERIRY_CHECKBOX));
        formFill.setRadio_button(setInformation(VERIRY_RADIO));
        formFill.setVisitDate(setInformation(VERIRY_VISITDATE));
        formFill.setComment(setInformation(VERIRY_COMMENT));

        return formFill;
    }

    public ArrayList<MakeAppointment> getMakeAppointmentItems() {
        ArrayList<MakeAppointment> products = new ArrayList<>();
        for (int i = 1; i <= getMakeAppointmentItemsSize(); i++) {
            products.add(getMakeAppointmentItem());
        }
        return products;
    }

    public int getMakeAppointmentItemsSize() {
        return getElementsSize(FACILITY);
    }

    public void compareProductMakeAppointment(MakeAppointment actual, MakeAppointment expected) {
        Assert.assertEquals(actual.getFacility(), expected.getFacility());
        Assert.assertEquals(actual.getCheckbox(), expected.getCheckbox());
        Assert.assertEquals(actual.getRadio_button(), expected.getRadio_button());
        Assert.assertEquals(actual.getVisitDate(), expected.getVisitDate());
        Assert.assertEquals(actual.getComment(), expected.getComment());
    }

    public void compareMakeAppointment(ArrayList<MakeAppointment> actual, ArrayList<MakeAppointment> expected) {
        Assert.assertEquals(actual.size(), expected.size());

        for (int i = 0; i < expected.size(); i++) {
            compareProductMakeAppointment(actual.get(i), expected.get(i));
        }
    }
}
