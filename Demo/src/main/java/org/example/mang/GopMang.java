package org.example.mang;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        mergeArray(array1, array2);
    }
    public static void mergeArray(int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++){
            array1[i] = i;
        }
        for (int j = 0; j < array2.length; j++){
            array2[j] = j;
        }
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
