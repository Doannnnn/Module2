package org.example.kethua.triangle;

import java.util.Scanner;

public class Triangle extends Shape{
    public double side1;
    public double side2;
    public double side3;
    public Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return  Math.sqrt(s * (s - this.side1) * (s - this.side2) + (s - this.side3));
    }
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }
    public String toString(){
        return "Triangle side1: " + this.side1 + ", side2: " + this.side2 + ", side3: " + this.side3 + ", color: " + getColor();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap do dai canh 1: ");
        double side1 = input.nextDouble();
        System.out.print("Nhap do dai canh 2: ");
        double side2 = input.nextDouble();
        System.out.print("Nhap do dai canh 3: ");
        double side3 = input.nextDouble();
        System.out.print("Nhap mau sac cua tam giac: ");
        String color = input.next();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.println("Thong tin tam giac");
        System.out.println(triangle.toString());
        System.out.println("Dien tich: " + triangle.getArea());
        System.out.println("Chi vi: " + triangle.getPerimeter());
        input.close();
    }
}
