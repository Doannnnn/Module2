package org.example.vonglap;

import java.util.Scanner;

public class HienThiHinh {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("Exit");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++){
                        for (int j = 0; j < 7; j++){
                            System.out.printf(" * ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 0; i < 5; i++){
                        for (int j = 1 + i; j > 0; j--){
                            System.out.printf(" * ");
                        }
                        System.out.printf("\n");
                    }
                    System.out.println("Print the square triangle");
                    for (int i = 0; i < 5; i++){
                        for (int j = 5 - i; j > 0; j--){
                            System.out.printf(" * ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 7; i >= 0; i--){
                        for (int j = 1; j <= i; j++){
                            System.out.printf(" * ");
                        }
                        System.out.printf("\n");
                    }
                    break;
            }
        }
    }
}
