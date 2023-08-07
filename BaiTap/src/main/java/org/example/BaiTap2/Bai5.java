package org.example.BaiTap2;

public class Bai5 {
    public static void main(String[] args) {
//        Bài 5: Hãy liệt kê các số trong mảng 1 chiều các số thực thuộc đoạn [x, y] cho trước

        double[] array = {1.5,3.2,-3.7,0.1,6.9,-4.3};
        checkNumbers(array, 1, 10);
    }
    public static void checkNumbers(double[] array, int x, int y){
        for (int i = 0; i < array.length; i++){
            if (array[i] > x && array[i] < y){
                System.out.println(array[i]);
            }
        }
    }
}
