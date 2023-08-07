package org.example.Mang;

import java.util.Arrays;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,9,5};
        deletePoint(array,8);
    }
    public static void deletePoint(int [] array, int x) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length-1] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
