package org.example.BaiTap;

public class Bai3 {
    public static void main(String[] args) {
//        Bài 3: Tính tổng 3 giá trị lẻ đầu tiên

        int [] array = {2,3,8,7,9,4,12};
        System.out.println("Tổng 3 số lẻ đầu tiên: " + totalOddValue(array));
    }
    public static int totalOddValue(int [] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                sum += array[i];
            }
        }
        return sum;
    }
}
