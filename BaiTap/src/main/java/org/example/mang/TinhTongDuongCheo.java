package org.example.mang;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int rows = input.nextInt();
        System.out.println("Nhập số cột: ");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.println("Nhập phần tử ở hàng " + i + " , cột " + j + " :");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < rows; i++){
           sum += array[i][i];
        }
        System.out.println(sum);
    }
}
