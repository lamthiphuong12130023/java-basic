package Pages;

import Objects.FormFill;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import static Locators.VerifyLocator.*;

public class VerifyPage extends BasePage {
    public VerifyPage(WebDriver driver) {
        super(driver);
    }

    public FormFill getFormFillItem() {
        FormFill formFill = new FormFill();
        formFill.setFacility(setInformation(VERIRY_FACILITY));
        formFill.setCheckbox(setInformation(VERIRY_CHECKBOX));
        formFill.setRadio_button(setInformation(VERIRY_RADIO));
        formFill.setVisitDate(setInformation(VERIRY_VISITDATE));
        formFill.setComment(setInformation(VERIRY_COMMENT));

        return formFill;
    }

    public ArrayList<FormFill> getFormFillItems() {
        ArrayList<FormFill> products = new ArrayList<>();
        for (int i = 1; i <= getFormFillItemsSize(); i++) {
            products.add(getFormFillItem());
        }
        return products;
    }

    public int getFormFillItemsSize() {
        return getElementsSize(FACILITY);
    }

    public void compareProductFormFill(FormFill actual, FormFill expected) {
        Assert.assertEquals(actual.getFacility(), expected.getFacility());
        Assert.assertEquals(actual.getCheckbox(), expected.getCheckbox());
        Assert.assertEquals(actual.getRadio_button(), expected.getRadio_button());
        Assert.assertEquals(actual.getVisitDate(), expected.getVisitDate());
        Assert.assertEquals(actual.getComment(), expected.getComment());
    }

    public void compareFulFillForm(ArrayList<FormFill> actual, ArrayList<FormFill> expected) {
        Assert.assertEquals(actual.size(), expected.size());

        for (int i = 0; i < expected.size(); i++) {
            compareProductFormFill(actual.get(i), expected.get(i));
        }
    }
}
