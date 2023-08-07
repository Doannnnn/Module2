package org.example.BaTapi3;

public class Bai1 {
    public static void main(String[] args) {
//        Bài 1: Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên

        int[] array = {1,3,4,6,7,8,11,15,16};
        oddValue(array);
    }
    public static void oddValue(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                System.out.println("các giá trị số lẻ trong mảng là: " + array[i]);
            }
        }
    }
}
