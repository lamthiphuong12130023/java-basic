package Day2;

import java.util.Scanner;

public class HWTimsolonnhat {
    public static void main(String[] args) {
        Sosanh();
    }

    public static void Sosanh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ 1: ");
        int a = sc.nextInt();
        System.out.println("Nhập số thứ 2: ");
        int b = sc.nextInt();
        System.out.println("Nhập số thứ 3: ");
        int c = sc.nextInt();

        if (a != b && a != c && b != c) {
            if (a > b && a > c) {
                System.out.println("Số lớn nhất là = " + a);
            } else if (b > a && b > c) {
                System.out.println("Số lớn nhất là = " + b);
            } else if (c > a && c > b) {
                System.out.println("Số lớn nhất là = " + c);
            }
        } else {
            if (a == b && a == c) {
                System.out.println("Cả ba số lớn bằng nhau");
            } else if (a == b && a < c) {
                System.out.println("Số lớn nhất là = " + c);
            } else if (a == b && a > c) {
                System.out.println("Số thu 1 và số thu 2 đều lớn ngang nhau");
            } else if (a == c && a > b) {
                System.out.println("Số thu 1 và số thu 3 đều lớn ngang nhau");
            } else if (a == c && a < b) {
                System.out.println("Số lớn nhất là " + b);
            } else if (b == c && b > a) {
                System.out.println("Số thu 2 và số thu 3 đều lớn ngang nhau");
            } else if (b == c && b < a) {
                System.out.println("Số lớn nhất là " + a);
            }
        }
    }
}

