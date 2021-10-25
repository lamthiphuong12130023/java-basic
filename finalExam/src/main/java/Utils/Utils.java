package Utils;

import Objects.FormFill;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static Utils.Constants.LINK_CSV_VERIFY;

public class Utils {
    /**
     * Read file csv
     *
     * @param string
     * @return
     */
    public static ArrayList<String> readCsv(String string) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(string);
            Scanner sc = new Scanner(file);
            System.out.println("Read file: ");
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                arrayList.add(str);
            }
            sc.close();
        } catch (FileNotFoundException f) {
            System.out.println("Not find the file");
        }
        return arrayList;
    }

    public static FormFill convertFormFillFromString(String str, String delimiter) {
        String[] strings = str.split(delimiter);
        FormFill formFill = new FormFill();
        formFill.setFacility(strings[0]);
        formFill.setCheckbox(strings[1]);
        formFill.setRadio_button(strings[2]);
        formFill.setVisitDate(strings[3]);
        formFill.setComment(strings[4]);
        return formFill;
    }
}

