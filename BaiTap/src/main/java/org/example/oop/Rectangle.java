package org.example.oop;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "width: " + this.width + ", height: " + this.height;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap width: ");
        double width = input.nextDouble();
        System.out.print("Nhap height: ");
        double height = input.nextDouble();
        Rectangle result = new Rectangle(width, height);
        System.out.println("Hinh chu nhat: " + result.display());
        System.out.println("Chu vi: " + result.getHeight());
        System.out.println("Dien tich: " + result.getArea());
    }
}
