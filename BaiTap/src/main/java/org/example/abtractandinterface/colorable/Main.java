package org.example.abtractandinterface.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Shape shape : shapes){
            System.out.println("Dien tich" + shape.getArea());
            if (shape instanceof Square){
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
        }

    }
}
