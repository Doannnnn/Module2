package org.example.BaiTap2;

public class Bai2 {
    public static void main(String[] args) {
//        Bài 2: Tính trung bình cộng các số dương trong mảng 1 chiều các số thực

        double[] array = {1.5,3.2,-3.7,0.1,6.9,-4.3};
        System.out.println(averagePositiveaArr(array));
    }
    public static double averagePositiveaArr(double[] array){
        double sum = 0.0;
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 0){
                sum += array[i];
            }
        }
        return sum / array.length;
    }
}
