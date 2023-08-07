package org.example.Mang;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int rows = scanner.nextInt();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cột: ");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Nhập phần tử: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println("Nhập phần tử ở hàng " + i + " , cột " + j + " :");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Nhập số cột muốn tính tổng: ");
        int col = input.nextInt();
        if (col >= 0 && col < cols){
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += array[i][col];
            }
            System.out.println("Tổng các phần tử tại cột " + col + " là: ");
            System.out.println(sum);
        } else {
            System.out.println("Cột không hợp lệ");
        }
    }
}
