package org.example.BaiTap;

import java.util.Arrays;

public class Bai9Chin {
    public static void main(String[] args) {
//        Bài 9: Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi

        int[] array = {2,7,-1,4,12,-3,5,-7};  // 2,4,-1,5,7,-3,12,-7
        arrangeArr(array);

    }
    public static void arrangeArr(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 0){
                for (int j = i + 1; j < array.length -1; j++){
                    if (array[j] >= 0){
                        if (array[i] > array[j]){
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            } else {
                for (int j = i + 1; j < array.length - 1; j++){
                    if (array[j] < 0){
                        if (array[i] < array[j]){
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
