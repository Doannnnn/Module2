package org.example.BaTapi3;

import java.util.Arrays;

public class Bai11 {
    public static void main(String[] args) {
//        Bài 11: Thêm x vào trong mảng tăng nhưng vẫn giữ nguyên tính tăng của mảng

        int[] array = {1,2,3,3,5,6,7,8,9};
        int [] result = addElementArrIncrease(array, 5);
        System.out.println(Arrays.toString(result));
    }
    public static int[] addElementArrIncrease(int[] array, int x){
       int[] newarray = new int[array.length + 1];
       int index = 0;
       while (index < array.length && array[index] < x){
           index++;
       }
        return newarray;
    }
}
