package org.example.BaiTap1;

public class Bai7 {
    public static void main(String[] args) {
//        Bài 7: tính trung bình các số chính phương trong mảng

        int[] array = {1,3,5,9,7,4};
        System.out.println("Trung bình số chính phương trong mảng là: " + squareAverage(array));
    }
    public static float squareAverage(int[] array){
        float sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (Math.sqrt(array[i]) == (int) (Math.sqrt(array[i]))){
                sum += array[i];
                count++;
                System.out.println(array[i]);
            }
        }
        return sum / count;
    }
}
