package org.example.Mang;

import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
    String[] students = {"Christian", "Michale", "Camila", "Sienna", "Tanya", "Connor", "Zacharia", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên học sinh: ");
        String input_name = input.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên trong danh sách " + input_name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không tìm thấy " + input_name + " trong danh sách.");
        }
    }
}
