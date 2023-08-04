package org.example.BaiTap;

public class Bai6 {
    public static void main(String[] args) {
//        Bài 6: tính tổng các số nguyên tố trong mảng

        int [] array = {2,3,11,9,5,8,17};
        System.out.println(" tổng các số nguyên tố trong mảng là: " + totalPrime(array));;
    }
    public static int totalPrime(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 2 ) {
                int index = 2;
                boolean flag = true;
                while (index < array[i]){
                    if (array[i] % index == 0){
                        flag = false;
                    }
                    index++;
                }
                if (flag){
                    total += array[i];
                    System.out.println(array[i]);
                }
            }
        }
        return total;
    }
}
