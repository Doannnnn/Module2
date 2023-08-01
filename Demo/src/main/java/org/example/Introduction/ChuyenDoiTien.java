package org.example.Introduction;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        double rate = 23000.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap USA muon doi: ");
        double usa = input.nextInt();
        double sum = usa * rate;
        System.out.println("So tien quy doi VND: " + sum);
    }
}
