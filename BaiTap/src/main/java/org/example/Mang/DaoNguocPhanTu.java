package org.example.Mang;

import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
    int size;
    int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập size: ");
            size = input.nextInt();
            if (size > 20)
            System.out.println("Không vượt quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng: ", "");
        for (int j = 0; j <array.length / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 -j] = temp;
        }
        System.out.printf("\n%-20s%s", "đảo ngược mảng: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}
