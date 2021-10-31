package Utils;

import Objects.MakeAppointment;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Utils {

    public String getToday(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
        System.out.println(strDate);
        return strDate;
    }

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

    public static MakeAppointment convertMakeAppointmentString(String str, String delimiter) {
        String[] strings = str.split(delimiter);
        MakeAppointment formFill = new MakeAppointment();
        formFill.setFacility(strings[0]);
        formFill.setCheckbox(strings[1]);
        formFill.setRadio_button(strings[2]);
        formFill.setVisitDate(strings[3]);
        formFill.setComment(strings[4]);
        return formFill;
    }

}

