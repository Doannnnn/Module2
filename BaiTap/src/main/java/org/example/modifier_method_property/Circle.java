package org.example.modifier_method_property;

public class Circle {
    public double radius;
    public String color;
    public Circle(){
        radius = 1.0;
        color = "RED";
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}
