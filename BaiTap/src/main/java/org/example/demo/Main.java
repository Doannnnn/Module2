package org.example.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void nhapThongTin(SinhVien tt) {
        System.out.println("Nhập mã số sinh viên: ");
        tt.setMaSv(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập họ và tên sinh viên: ");
        tt.setHoTen(sc.nextLine());
        System.out.println("Nhập địa chỉ sinh viên: ");
        tt.setDiaChi(sc.nextLine());
        do {
            System.out.println("Nhập số điện thoại bao gồm 7 số: ");
            tt.setSdt(sc.nextLine());
        } while (tt.getSdt().length() != 7);
    }

    public static void main(String[] args) {
        SinhVien[] sv = null;
        int a, n = 0;
        boolean flag = true;

        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("1.Nhập thông tin sinh viên. \n" +
                    "2.Xuất danh sách sinh viên.\n" +
                    "Nhập số 0 để thoát");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Nhập số lượng sinh viên cần khai báo: ");
                    n = sc.nextInt();
                    sv = new SinhVien[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1) + ": ");
                        sv[i] = new SinhVien();
                        nhapThongTin(sv[i]);
                    }
                    break;
                case 2:
                    SinhVien temp = sv[0];
                    for (int i = 0; i < sv.length - 1; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getMaSv() > sv[j].getMaSv()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    System.out.printf("%-5s %15s %15s %20s \n", "MSSV", "Họ và tên", "Địa chỉ", "Số điện thoại");
                    for (int i = 0; i < n; i++) {
                        sv[i].HienThiTT();
                    }
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}