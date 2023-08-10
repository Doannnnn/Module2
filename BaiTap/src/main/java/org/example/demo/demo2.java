package org.example.demo;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        int[] array = {4,7,9,11,12,13,17,20};
        movePrimesToFront(array);
    }
    public static void movePrimesToFront(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
            if (array[i] >= 2){
                int index = 2;
                boolean flag = true;
                while (index < array[i]){
                    if (array[i] % index == 0){
                        flag = false;
                        break;
                    }
                    index++;
                }
                if (!flag){
                    flag = true;
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
