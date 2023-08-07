package org.example.Mang;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,9,5,0,0};
        addElement(array, 1, 1);
    }

    public static void addElement(int[] array, int x, int index){
        if (index <= -1 || index >= array.length - 1){
            System.out.println("Không chèn được phần tử vào mảng");
            return;
        }
        for (int i = 0; i < array.length; i++){
            if (i == index){
                for (int j = i + 1; j < array.length - 1; j++){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                array[i] = x;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
