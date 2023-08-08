package org.example.introduction;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap width: ");
        width = scanner.nextInt();
        System.out.println("Nhap height: ");
        height = scanner.nextInt();
        float area = width * height;

        System.out.println(area);
    }
}
