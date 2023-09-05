package org.example.batapi3;

import java.util.Arrays;

public class Bai10 {
    public static void main(String[] args) {
//        Bài 10: Thêm 1 phần tử x vào mảng tại vị trí k

        int[] array = {1,8,4,13,5,9,};
        addElementArr(array, 10, 1);
    }
    public static void addElementArr(int[] array, int x, int k) {
        int[] newarray = new int[array.length + 1];
        if (k < 0 || k > array.length - 1){
            System.out.println("Vi tri kh co trong mang");
            return;
        }
        for (int i = 0; i < array.length; i++){
            newarray[i] = array[i];
        }
        for (int i = 0; i < newarray.length; i++){
            if(i == k){
                for (int j = i + 1; j < newarray.length; j++){
                    int temp = newarray[i];
                    newarray[i] = newarray[j];
                    newarray[j] = temp;
                }
                newarray[i] = x;
            }
        }
        System.out.println(Arrays.toString(newarray));
    }
}
