package Day3;

public class TotalAverage {
    public static void main(String[] args) {
        double[] array = {1, 5, 9, 40, 2, 1};
        double total = 0.0;
        Avegare(array,total);
    }
    public static void Avegare(double array[], double total){
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];

        }
        System.out.println("Kết quả là:" + total);
        double average = total / array.length;
        System.out.println("Kết quả là:" + average);
    }

}
