package org.example.BaiTap;

import java.util.Arrays;

public class Bai4 {
    public static void main(String[] args) {
//        Bài 4: Đảo ngược mảng

        int [] array = {12,3,8,9,5};
        reverseArray(array);
    }
    public static void reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
