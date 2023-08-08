package org.example.oop;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta =  this.b * this.b - 4 * this.a * this.c;
        return delta;
    }
    public double getRoot1(){
        double delta = getDiscriminant();
        double r1 = (-this.b + Math.sqrt(delta)) / (2 * a);
        return r1;
    }
    public double getRoot2(){
        double delta = getDiscriminant();
        double r2 = (-this.b - Math.sqrt(delta)) / (2 * a);
        return r2;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = input.nextDouble();
        System.out.print("Nhap b: ");
        double b = input.nextDouble();
        System.out.print("Nhap c: ");
        double c = input.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double delta = qe.getDiscriminant();
        System.out.println(delta);
        if (delta > 0){
        double root1 = qe.getRoot1();
        double root2 = qe.getRoot2();
            System.out.println("phuong trinh co 2 nghiem: x1 = " + root1 + " , x2 =  "  + root2);
        } else if (delta == 0){
            double root = qe.getRoot1();
            System.out.println("phuong trinh co mot nghiem kep: x = " + root);
        } else {
            System.out.println("phuong trinh kh co nghiem");
        }
    }
}
