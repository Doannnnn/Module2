package org.example.batapi3;

public class Bai3 {
    public static void main(String[] args) {
//        Bài 3: Đếm số lượng giá trị tận cùng bằng 5 trong mảng


        int[] array = {1,3,5,9,7,4,11,15,17,25};
        System.out.println("Số lượng giá trị tận cùng bằng 5 trong mảng là: " + countValue(array));

    }
    public static int countValue(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 10 == 5){
                count++;
            }
        }
        return count;
    }
}
