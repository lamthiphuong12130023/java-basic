package Day2;

import java.util.Scanner;

public class Swithcase {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Nhập số a = ");
    int a=sc.nextInt();
    int number = 6;
    String day="";

    switch (number) {
        case 1:
            day="Monday";
     //       System.out.println("Day la thu 3");
            break;
        case 2:
            day="Tuesday";
            break;
        case 3:
            day="Wednesday";
            break;
        case 4:
            day="Thursday";
            break;
        case 5:
            day="Friday";
            break;
        case 6:
            day="Saturday";
            break;
        case 7:
            day="Sunday";
            break;
        default:
            day="invalid day";
    }
    System.out.println(day);
}
}
