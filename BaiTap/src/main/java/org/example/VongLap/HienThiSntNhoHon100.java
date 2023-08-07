package org.example.VongLap;

public class HienThiSntNhoHon100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            int n = 2;
            boolean check = true;
            while (n < i) {
                if (i % n == 0){
                    check = false;
                    break;
                }
                n++;
            }
            if (check) {
                System.out.println(i + " Là số nguyên tố");
            }
        }
    }
}
