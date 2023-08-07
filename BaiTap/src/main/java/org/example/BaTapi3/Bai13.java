package org.example.BaTapi3;

import java.util.Arrays;

public class Bai13 {
    public static void main(String[] args) {
//        Bài 13: Xóa tất cả các số chẵn trong mảng

        int[] array = {3,7,4,9,6,12,5};
        int[] result = eraseEvenNumberArr(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] eraseEvenNumberArr(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                count++;
            }
        }
        int[] newarray = new int[count];
        int index = 0;
        for (int j = 0; j < array.length; j++){
            if (array[j] % 2 != 0){
                newarray[index] = array[j];
                index++;
            }
        }
        return newarray;
    }
}
