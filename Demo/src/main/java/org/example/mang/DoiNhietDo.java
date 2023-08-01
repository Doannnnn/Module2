package org.example.mang;

import java.util.Scanner;

public class DoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menuu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập độ F: ");
                    fahrenheit = input.nextInt();
                    System.out.println("độ F sang độ C: " + celsiusToFahrenheit(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập độ C: ");
                    celsius = input.nextInt();
                    System.out.println("độ C sang độ F: " + fahrenheitToCelsius(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);;
        return celsius;
    }

}
