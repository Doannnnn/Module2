package org.example.baitap2;

public class Bai1 {
    public static void main(String[] args) {
//        Bài 1: Tính tổng các giá trị lớn hơn giá trị đứng liền trước nó trong mảng 1 chiều các số thực

        double[] array = {3.1,7.5,1.2,6.0,4.9,2.6};
        System.out.println("tổng các giá trị là: " + totalValueBigInFront(array));
    }
    public static double totalValueBigInFront(double[] array){
        double sum = 0.1;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                System.out.println(array[i]);
                sum += array[i];
            }
        }
        return sum;
    }
}
