package org.example.batapi3;

public class Bai2 {
    public static void main(String[] args) {
//        Bài 2: Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố trong mảng 1 chiều các số nguyên

        int[] array = {1,3,4,6,7,8,11,15,17};
        checkPrimeArr(array);
    }
    public static void checkPrimeArr(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 2){
                int index = 2;
                boolean flag = true;
                while (index < array[i]){
                    if (array[i] % index == 0){
                        flag = false;
                        break;
                    }
                    index++;
                }
                if (flag){
                    System.out.println("Vi tri cac so nguyen to trong mang la: " + i);
                }
            }
        }
    }
}
