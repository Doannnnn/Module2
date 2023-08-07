package org.example.BaiTap1;

import java.util.Arrays;

public class Bai5 {
    public static void main(String[] args) {
//        Bài 5: nối mảng b vào mảng a

        int[] array1 = {1,3,5,7};
        int[] array2 = {2,4,6,8};
        arrayConcatenation(array1, array2);
    }
    public static void arrayConcatenation(int[] array1, int[] array2){
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++){
            array3[array1.length + j] = array2[j];
        }
        System.out.println(Arrays.toString(array3));
    }
}
