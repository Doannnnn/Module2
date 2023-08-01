package org.example.vonglap;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = aa.nextInt();
        if (number < 2) {
            System.out.println(number + " Không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " Là số nguyên tố");
            } else {
                System.out.println(number + " hông phải là số nguyên tố");
            }
        }
    }
}
