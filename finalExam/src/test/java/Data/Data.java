package Data;

import Objects.Account;
import Objects.FormFill;
import Pages.BasePage;
import Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static Utils.Constants.LINK_CSV_VERIFY;
import static Utils.Utils.convertFormFillFromString;

public class Data {

    static WebDriver driver;
    static BasePage basePage = new BasePage(driver);

    public static Account getDataAccount() {
        Account account = new Account();
        account.setUsername("John Doe");
        account.setPassword("ThisIsNotAPassword");
        return account;
    }


    public static ArrayList<FormFill> getFormFill() {
        ArrayList<String> arrayList = Utils.readCsv(LINK_CSV_VERIFY);
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Seoul CURA Healthcare Center;Yes;Medicaid;25/10/2021;abc");
        ArrayList<FormFill> formFills_arrayList = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            formFills_arrayList.add(convertFormFillFromString(arrayList.get(i).toString(), ";"));
        }

        return formFills_arrayList;
    }

}
