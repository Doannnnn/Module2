package org.example.VongLap;

import java.util.Scanner;

public class HienThi20SoDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can hien thi");
        int numbers = sc.nextInt();
        int count = 0;
        int N =2;
        System.out.println("Hien thi " + numbers + " snt dau tien");
        while (count < numbers) {
            if(checkSnt(N)) {
                System.out.printf("%-3s",N);
                N++;
                count++;
            } else {
                N++;
            }

        }
    }
    private static boolean checkSnt(int n){
        int count = 0;
        boolean check = true;
        if (n < 2) {
            return false;
        } else {
            if (n == 2){
                return true;
            } else {
                for (int i = 3; i < n - 1; i++){
                    if (n % i == 0){
                       return false;
                    }
                }
            }
        }
        return check;
    }
}
