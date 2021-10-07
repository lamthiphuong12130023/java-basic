package Day3;

public class Biggestnumbersmallestnumber {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 7, 3, 80, 7, 12, 55};
        int max = 0;
        int min = 8;
        Biggestnumber(arr, max);
        Smallestnumber(arr, min);
    }

    public static void Biggestnumber(int a[], int max) {

        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];

        }
        System.out.println("Số lớn nhất là: " + max);
    }

    public static void Smallestnumber(int a[], int min) {

        for (int i = 0; i < a.length; i++) {
            if (min >= a[i])
                min = a[i];

        }
        System.out.println("Số nhỏ nhất là: " + min);
    }
}
//    public static void print(int a) {
//      System.out.println("Số lớn nhất là: "+a );
//   }


