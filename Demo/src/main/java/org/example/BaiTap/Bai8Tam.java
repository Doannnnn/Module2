package org.example.BaiTap;

import java.util.Arrays;

public class Bai8Tam {
    public static void main(String[] args) {
//        Bài 8: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí

        int[] array = {-1,7,-3,4,-12,-5,9}; // {-5,7,-3,4,12,-1,9}
        arrangeArr(array);
    }
    public static void arrangeArr(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                for (int j = i + 1; j < array.length; j++){
                    if (array[j] < 0){
                        if (array[i] > array[j]){
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
