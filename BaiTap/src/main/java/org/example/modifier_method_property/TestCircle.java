package org.example.modifier_method_property;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle(2.0);
        double radius = cir.getRadius();
        System.out.println("Radius: " + radius);
        double area = cir.getArea();
        System.out.println("Area: " + area);
    }
}
