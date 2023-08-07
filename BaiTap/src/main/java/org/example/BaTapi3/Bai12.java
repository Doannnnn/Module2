package org.example.BaTapi3;

import java.util.Arrays;

public class Bai12 {
    public static void main(String[] args) {
//        Bài 12: Xóa tất cả các số âm trong mảng

        int[] array = {3,-2,8,4,-5,11,-7};
        int[] result = eraseNegativeArr(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] eraseNegativeArr(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 0){
                count++;
            }
        }
        int[] newarray = new int[count];
        int index = 0;
        for (int j = 0; j < array.length; j++){
            if (array[j] >= 0){
                newarray[index] = array[j];
                index++;
            }
        }
        return newarray;
    }
}
