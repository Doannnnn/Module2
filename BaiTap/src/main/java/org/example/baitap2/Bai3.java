package org.example.baitap2;

import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
//        Bài 3: Đưa các số chia hết cho 3 về đầu mảng

        int[] array = {6,4,9,2,15,7,11};
        int[] result = arrangeArr(array);
        System.out.println(Arrays.toString(result));

    }
    public static int[] arrangeArr(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] % 3 == 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
