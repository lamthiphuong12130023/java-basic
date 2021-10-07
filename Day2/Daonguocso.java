package Day2;

import java.util.Scanner;

public class Daonguocso {
    public static void Nguoc(int number) {
        int a;
        int b = 0;
        while (number != 0) {
            a = number % 10;
            b = b * 10 + a;
            number = number / 10; //=number /=10
        }
        System.out.println("So dao nguoc = " + b);
    }

    public static void main(String[] arg) {
        int h = 987654321;
        Nguoc(h);

    }
}
