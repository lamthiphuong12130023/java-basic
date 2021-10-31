package arrayandstring;

import java.util.Arrays;

public class ArrayAndString {
    public static void main(String[] strings) {

        appearsaseither();
        firstAndtheLastElementOfAnArrayOfIntegersAreTheSame();
        theFirstAndTheLastElementOfTwoArraysOfIntegersAreTheSame();
        createANewArrayOfLength2fromTwoArrays();
        integersOfLength2ContainsA4OrA7();
        rotateAnArray();
        theLargerValueBetweenTheFirstAndLastElement();
        swapTheFirstAndLastElements();
        findTheLargestElementBetweenFirstLastAndMiddleValues();
        evenAndOddElement();
    }

    public static void appearsaseither() {
        int[] arrays = {10, -20, 0, 30, 40, 60, 10};
        if (arrays[0] == 10) {
            System.out.println("Number 10 appears the first arrays");

        } else if (arrays[6] == 10) {
            System.out.println("Number 10 appears the last arrays");

        } else {
            System.out.println("Number 10 appears the first and last arrays");
        }
    }

    public static void firstAndtheLastElementOfAnArrayOfIntegersAreTheSame() {
        int arrays[] = {50, -20, 0, 30, 40, 60, 10};
        if (arrays[0] == arrays[arrays.length - 1]) {
            System.out.println("The first and the last element of an array of integers are the same");

        } else {
            System.out.println("The first and the last element of an array of integers are not the same");

        }

    }

    public static void theFirstAndTheLastElementOfTwoArraysOfIntegersAreTheSame() {
        int[] arr = {50, -20, 0, 30, 40, 60, 12};
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == arr[i]) {
                System.out.println("the first and the last element of " + arr[i] + " arrays of integers are the same");
            }

        }
        System.out.println("Not i the same the first");


    }

    public static void createANewArrayOfLength2fromTwoArrays() {
        int[] arrays = {50, -20, 0};
        int[] arr = {5, -50, 10};
        System.out.println("Array 1  = " + Arrays.toString(arrays));
        System.out.println("Array 2  = " + Arrays.toString(arr));
        int[] array_new = {arrays[0], arr[2]};
        System.out.println("New array  = " + Arrays.toString(array_new));
    }

    public static void integersOfLength2ContainsA4OrA7() {
        int[] ints = {5, 7};
        if (ints[0] == 4 || ints[0] == 7 || ints[1] == 4 || ints[1] == 7) {
            System.out.println("True");
        } else System.out.println("False");
    }

    public static void rotateAnArray() {
        int[] arrays = {20, 30, 40};
        int[] new_arrays = {arrays[2], arrays[1], arrays[0]};
        System.out.println("Old array = " + Arrays.toString(arrays));
        System.out.println("New array = " + Arrays.toString(new_arrays));
    }

    public static void theLargerValueBetweenTheFirstAndLastElement() {
        int[] arrays = {20, 30, 40};
        if (arrays[0] >= arrays[2]) {
            System.out.println("The lager value is the first =" + arrays[0]);

        } else {
            System.out.println("The lager value is the first = " + arrays[2]);

        }
    }

    public static void swapTheFirstAndLastElements() {
        int[] arr = {20, 30, 40};
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        int[] new_array = {arr[0], arr[1], arr[2]};
        System.out.println("New array " + Arrays.toString(new_array));
    }

    public static void findTheLargestElementBetweenFirstLastAndMiddleValues() {
        int[] arr = {20, 30, 40, 50, 67};
        if (arr[0] >= arr[arr.length - 1] && arr[0] >= arr[arr.length / 2]) {
            System.out.println("The largest first Element = " + arr[0]);

        } else if (arr[arr.length - 1] > arr[0] && arr[arr.length - 1] > arr[arr.length / 2]) {
            System.out.println("The largest last Element = " + arr[arr.length - 1]);

        } else System.out.println("The largest middle Element = " + arr[arr.length / 2]);

    }

    public static void evenAndOddElement() {
        int[] arrays = {1, 3, 4, 6, 3, 6, 7, 10, 14};
        int oddElement = 0;
        int evenElement = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                evenElement++;
            } else {
                oddElement++;
            }
        }
        System.out.println("The count of even element = " + evenElement);
        System.out.println("The count of odd element = " + oddElement);
    }

}