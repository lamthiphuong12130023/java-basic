package Day2;

import java.util.Scanner;

public class HWSonguyenamduong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần xác định = ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("Số nguyên dương");
        } else if (a < 0) {
            System.out.println("Số nguyên âm");
        } else System.out.println("Đây là số 0");


    }

}
