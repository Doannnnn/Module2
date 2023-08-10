package org.example.demo;

import java.util.Arrays;

public class demo3 {
    public static void main(String[] args) {
        int[] array = {4,7,9,11,12,13,0};
        removeElementByPosition(array, 3);
    }
    public static void removeElementByPosition(int[] array, int index){
        for (int i = 0; i < array.length; i++){
            if (i == index){
                for (int j = i; j < array.length - 1; j++){
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
