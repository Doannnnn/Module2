package org.example.Introduction;

import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Cân nặng của bạn (tính bằng kilogam):");
        weight = input.nextDouble();
        System.out.println("Chieu cao của bạn (tính bằng m):");
        height = input.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Thiếu cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}
