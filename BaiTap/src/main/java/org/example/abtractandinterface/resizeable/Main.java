package org.example.abtractandinterface.resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        System.out.println("Dien tich cac phan tu truoc khi tang kich thuoc:");
        for (Shape shape : shapes){
            System.out.println("Dien tich: " + shape.getArea());
        }
        System.out.println("Dien tich cac phan tu sau khi tang kich thuoc:");
        for (Shape shape : shapes){
            double percent = Math.floor(Math.random()* (100 - 1 + 1)) + 1;
            shape.resize(percent);
            System.out.println("Dien tich: " + shape.getArea());
        }
    }
}
