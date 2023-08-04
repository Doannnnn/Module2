package org.example.BaiTap;public class Bai1 {
    public static void main(String[] args) {
//        Bài 1: tìm giá trị lớn nhất của mảng

        int [] array = {1,3,5,7,9};
        System.out.println("giá trị lớn nhất trong mảng là: " + findGreatestValueArr(array));
    }
    public static int findGreatestValueArr(int[] array){
        int maxValue = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
