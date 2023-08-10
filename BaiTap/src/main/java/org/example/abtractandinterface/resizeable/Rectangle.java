package org.example.abtractandinterface.resizeable;

public class Rectangle extends Shape{
    public double width;
    public double length;
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * this.length;
    }
    public double getPerimeter(){
        return 2 * (width + this.length);
    }
    public String toString(){
        return "A Rectangle with width " + this.width + " and length " + this.length + ", which is a subclass of " + super.toString();
    }
    @Override
    public void resize(double percent) {
        width *= (1 + percent / 100);
        length *= (1 + percent / 100);
    }
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            System.out.println(rectangle);

            rectangle = new Rectangle(2.3, 5.8);
            System.out.println(rectangle);

            rectangle = new Rectangle(2.5, 3.8, "orange", true);
            System.out.println(rectangle);
        }


}
