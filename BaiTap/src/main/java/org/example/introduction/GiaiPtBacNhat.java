package org.example.introduction;

import java.util.Scanner;

public class GiaiPtBacNhat {
    public static void main(String[] args) {
        System.out.println("Trình giải phương trình tuyến tính");
        System.out.println("Cho một phương trình là 'a * x + b = c', vui lòng nhập các hằng số:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0){
            double answer = (c - b) / a;
            System.out.printf("Truyền phương trình với x = %f!\n", answer);
        } else {
            if (b == c){
                System.out.println("Giải pháp là tất cả x!");
            } else {
                System.out.println("Không có giải pháp!");
            }
        }
    }
}
