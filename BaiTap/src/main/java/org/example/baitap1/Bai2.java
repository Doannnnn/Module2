package org.example.baitap1;

public class Bai2 {
    public static void main(String[] args) {
//        Bài 2: tìm giá trị lớn thứ 2 trong mảng

        int [] array = {11,3,8,7,9};
        System.out.println("giá trị lớn thứ 2 trong mảng là: " + findSecondValueArr(array));

    }
    public static int findSecondValueArr(int [] array){
        int maxValue = 0;
        int secondValue = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > secondValue && array[i] < maxValue){
                secondValue = array[i];
            }
        }
        return secondValue;
    }
}
