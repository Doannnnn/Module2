package org.example.mang;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự là: " + count);
    }
}
