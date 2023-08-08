package org.example.batapi3;

public class Bai4 {
    public static void main(String[] args) {
//        Bài 4: Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0


        int[] array = {1,3,4,6,7,8,11,15,17};
        System.out.println(checkValueArr(array));
    }
    public static int checkValueArr(int[] array){
        for (int i = 0; i < array.length; i++){
           if (array[i] == 0){
               return 1;
           }
        }
        return 0;
    }
}
