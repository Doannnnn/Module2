package org.example.baitap4.Bai2;

public class Newspaper extends Document{
    public int numberIssue;
    public  int releaseMonth;
    public Newspaper(){

    }
    public Newspaper(int id, String nxb, int number, int numberIssue, int releaseMonth){
        super(id, nxb, number);
        this.numberIssue = numberIssue;
        this.releaseMonth = releaseMonth;
    }

    public int getNumberIssue() {
        return numberIssue;
    }

    public void setNumberIssue(int numberIssue) {
        this.numberIssue = numberIssue;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }
}
