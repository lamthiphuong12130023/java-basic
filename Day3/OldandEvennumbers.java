package Day3;

public class OldandEvennumbers {
    public static void main(String[] args) {
        int arr[] = {1, 0, 4, 6, 16, 5, 3, 7, 9, 8, 15, 10, 17, 35, 25, 75, 74};
        Oldnumber(arr);
        Evennumber(arr);
    }

    public static void Oldnumber(int array[]) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println("Số 0 không chẵn không lẻ " + array[i]);
            } else if (array[i] % 2 != 0) {
                System.out.println("Số lẻ = " + array[i]);

            }

        }
    }

    public static void Evennumber(int arra[]) {

        for (int i = 0; i < arra.length; i++) {
            if (arra[i] % 2 == 0) {
                System.out.println("Số chẵn = " + arra[i]);
            }

        }
    }


}