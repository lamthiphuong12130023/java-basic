package Day3;

import java.util.Scanner;

public class Matrices {
    public static void main(String arg[]){
        int a;  // số dòng của ma trận
        int b;  // số cột của ma trận
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số dòng của ma trận:");
            a = scanner.nextInt();
            System.out.println("Nhập vào số cột của ma trận:");
            b = scanner.nextInt();
        } while (a < 1 || b < 1);

        // khai báo 2 ma trận A và B có m dòng và n cột
        int A[][] = new int[a][b];
        int B[][] = new int[a][b];

        // ma trận tổng C
        int C[][] = new int [a][b];

        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập các phần tử cho ma trận B:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("B[" + i + "," + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Ma trận B:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // Để tính tổng hai ma trận
        // ta sẽ sử dụng 2 vòng lặp for
        // để duyệt i từ 0 đến m và j từ 0 đến n
        // sau đó tính tổng hai phần tử
        // tại vị trí i, j tương ứng của 2 ma trận A, B
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // hiển thị ma trận tổng C
        System.out.println("Ma trận tổng C:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
