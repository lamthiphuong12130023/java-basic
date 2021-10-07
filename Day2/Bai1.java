package Day2;

import java.util.Locale;

public class Bai1 {
    public static void  main(String args[]){
//            double [] test = new double[5];
//            double [] test1 ={1,1.5,2};
//            double [] test2 ={-1,4};
//            System.out.println(test1[0]); //Truy cập giá trị thông qua index vị trí thứ 0
//            System.out.println(test1[1]);
//            System.out.println(test1[2]);
        String [] string1 = {"aaa","bbb","cccc","bbbc"};
//        for(int i=0;i<string1.length;i++){
//            System.out.print(string1[i]);
//
////        }
//        for (String str : string1){
//            System.out.println("In "+str);
//            if(str.equalsIgnoreCase(anotherString: "bbb")){
//            System.out.println(str);
//
//        }
        String[] fruits = { "Apple", "Pear", "Strawberry", "apple", "ApplE" };
//        System.out.println(fruits[1]);

        for (String fruit : fruits) {
            System.out.println("In het ra: " + fruit);
            //equalsIgnoreCase so sánh chuỗi không tính hoa thường, equal so sánh cả hoa thường, == chỉ cho số
            if (fruit.equalsIgnoreCase("apple")) {
                System.out.println(fruit);
            }
        }
    }
}
