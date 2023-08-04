package org.example.BaiTap;

public class Bai12 {
    public static void main(String[] args) {
//        Bài 12: Tính tổng: tam giác trên trái, trên phải, dưới trái, dưới phải

        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {6,1,4,2},
                {7,9,5,2}
        };
//        System.out.println(totalUpperLeftTriangle(array));
//        System.out.println(totalUpperRightTriangle(array));
//        System.out.println(totalLowerLeftTriangle(array));
        System.out.println(totalLowerRightTriangle(array));
    }
    public static int totalUpperLeftTriangle(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i; j++){
                System.out.println(array[i][j]);
                total += array[i][j];
            }
        }
        return total;
    }
    public static int totalUpperRightTriangle(int[][] array){
        int total = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0 + i; j < array.length; j++){
                System.out.println(array[i][j]);
                total += array[i][j];
            }
        }
        return total;
    }
    public static int totalLowerLeftTriangle(int[][] array){
        int total = 0;
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--){
            for (int j = 0; j < array.length - count; j++){
                System.out.println(array[i][j]);
                total += array[i][j];
            }
            count++;
        }
        return total;
    }
    public static int totalLowerRightTriangle(int[][] array){
        int total = 0;
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--){
            for (int j = 0 + count; j < array.length; j++){
                System.out.println(array[i][j]);
                total += array[i][j];
            }
            count++;
        }
        return total;
    }
}
