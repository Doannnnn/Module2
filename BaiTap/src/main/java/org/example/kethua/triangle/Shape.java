package org.example.kethua.triangle;

public class Shape {
    public String color;
    public Shape(){
        color = "BLUE";
    }
    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
    public String toString(){
        return "color: " + this.color;
    }
}
