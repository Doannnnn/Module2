package org.example.mang;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner ipnut = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int rows = ipnut.nextInt();
        System.out.println("Nhập số cột: ");
        int cols = ipnut.nextInt();
        double[][] matrix = new double[rows][cols];
        System.out.println("Nhập phần tử: ");
        double max = 0.1;
        int rowPosition = 0;
        int colPosition = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print("Nhập phần tử ở hàng " + (i) + ", cột " + (j) + ": ");
                matrix[i][j] = ipnut.nextDouble();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    System.out.println(max);
                    rowPosition = i;
                    colPosition = j;
                }
            }
        }
        System.out.println("phần tử lớn nhất trong mảng là: " + max + " , hàng " + rowPosition + " , cột " + colPosition);
    }
}

