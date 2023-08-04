package org.example.BaiTap;

import java.util.Arrays;

public class Bai7Bay {
    public static void main(String[] args) {
//        Bài 7: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí

        int[] array = {2,7,-3,4,12,-1,5}; // 2,4,-3,5,7,-1,12
        arrangeArr(array);
    }
    public static void arrangeArr(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] >= 0){
                for (int j = i + 1; j < array.length; j++){
                    if (array[j] >= 0) {
                        if (array[i] > array[j]) {
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
