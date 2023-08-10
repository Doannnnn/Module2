package org.example.demo;

import java.util.Scanner;

public class SinhVien {
    public int maSv;
    public String hoTen;
    public String diaChi;
    public String sdt;
    public SinhVien(){

    }
    public SinhVien(int maSv, String hoTen, String diaChi, String sdt){
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    public int getMaSv(){
        return this.maSv;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public String getDiaChi(){
        return this.diaChi;
    }
    public String getSdt(){
        return this.sdt;
    }
    public void setMaSv(int newMaSv){
        this.maSv = newMaSv;
    }

    public void setHoTen(String newHoTen) {
        this.hoTen = newHoTen;
    }

    public void setDiaChi(String newDiaChi) {
        this.diaChi = newDiaChi;
    }

    public void setSdt(String newSdt) {
        this.sdt = newSdt;
    }
    public String toString(){
        return "Ma so: " + this.maSv + "; Ho va ten: " + this.hoTen + "; Dia chi: " + this.diaChi + "; SDT: " + this.sdt;
    }
    public void HienThiTT(){System.out.printf("%-5d %-20s %-15s %-15s \n", maSv, hoTen, diaChi, sdt);}

}
