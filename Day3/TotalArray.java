package Day3;

public class TotalArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 40, 1, 10};
        Total(array);

    }

    public static void Total(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        System.out.println("Kết quả là:" + total);
    }

//    public static void print(int number) {
//        System.out.println("Kết quả là:" + number);
//    }
}
