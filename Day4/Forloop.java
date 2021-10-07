package Day4;

import javax.swing.text.DefaultEditorKit;

public class Forloop {

    public static void main(String[] args) {
        forloop();
        dowhile();
        twoForloop();
        continueforloop();
        continuedowhile();
        continuewhile();
    }

    public static void forloop() {
        for (int i = 1; i <= 20; i++) {
            if (i == 8) {
                print(i);
            }
        }

    }

    public static void dowhile() {
        int i = 0;
        do {
            i++;
            if (i == 80) print(i);
        } while (i <= 80);
    }

    public static void twoForloop() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 30; j++) {
                if (j == 4) break;
                print(j);
            }
            print(i);
        }
    }

    public static void continueforloop() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                //print(i);
                continue;
            print(i);
        }
    }

    public static void continuedowhile() {
        int i = 0;
        do {
            i++;
            if (i == 5) continue;
            print(i);
        } while (i <= 10);

    }

    public static void continuewhile() {

        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                continue;
            }
            print(i);
            i++;
        }
        System.out.println("Hết");

    }

    public static void print(int value) {
        System.out.println(value);
    }
}
