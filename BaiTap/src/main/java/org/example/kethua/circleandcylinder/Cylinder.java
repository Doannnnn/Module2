package org.example.kethua.circleandcylinder;

public class Cylinder extends Circle{
    public double height;
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea() * height;
    }
    @Override
    public String toString(){
        return "Cylinder radius: " + getRadius() + ", color: " + getColor() + ", area: " + getArea() + ", volume: " + getVolume();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(10.0, 3.0, "red");
        System.out.println(cylinder);
    }
}
