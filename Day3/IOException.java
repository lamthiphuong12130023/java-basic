package Day3;

import java.util.Scanner;

public class IOException {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a");

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tong = a + b;
            System.out.println("Tổng là = " + tong);
        } catch (Exception s) {
            System.out.println("Đây không phải là số");
        }
    }
}
