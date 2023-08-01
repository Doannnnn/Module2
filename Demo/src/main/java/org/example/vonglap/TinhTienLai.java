package org.example.vonglap;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
    double money = 1.0;
    int month = 1;
    double interestRate = 1.0;
    Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        money = input.nextDouble();
        System.out.println("Nhập lãi xuất: ");
        interestRate = input.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        month = input.nextInt();
        double totalInterest = 0;
        for ( int i = 1; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng tiền lãi: " + totalInterest);
    }
}
