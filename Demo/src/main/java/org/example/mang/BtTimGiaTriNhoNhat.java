package org.example.mang;

import java.util.Scanner;

public class BtTimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("nhập phần tử " + (i+1));
            arr[i] = input.nextInt();
        }
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[index]);
    }
    public  static int minValue(int[] array){
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
