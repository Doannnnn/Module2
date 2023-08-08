package org.example.baitap2;

import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) {
//        Bài 4: Đảo ngược mảng ban đầu

        int[] array = {6,4,9,2,15,7,11};
        int[] result = reverseArr(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] reverseArr(int[] array){
        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
