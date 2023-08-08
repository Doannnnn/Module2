package org.example.mang;

import java.util.Scanner;

public class DemSoLuong {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập size: ");
            size = input.nextInt();
            if (size > 30)
                System.out.println("Kích thước không được vượt quá 30");
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.println("Nhập điểm cho học sinh " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
        int count = 0;
        System.out.println("Danh sách đánh dấu");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10){
                count++;
            }
        }
        System.out.println("\n Số học sinh thi đạt là: " + count);
    }
}
