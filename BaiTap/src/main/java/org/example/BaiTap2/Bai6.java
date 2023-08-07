package org.example.BaiTap2;

public class Bai6 {
    public static void main(String[] args) {
//        Bài 6: Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện lớn hơn giá trị tuyệt đối của giá trị đứng liền sau nó

        int[] array = {5,3,-6,11,-2,-4,9};
    }
    public static void checkNumbersArr(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[i]) < array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}
