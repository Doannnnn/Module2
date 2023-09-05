package org.example.baitap4.Bai2;

public class TaiLieu {
    public int id;
    public String nxb;
    public int number;
    public TaiLieu(){

    }
    public TaiLieu(int id, String nxb, int number){
        this.id = id;
        this.nxb = nxb;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
