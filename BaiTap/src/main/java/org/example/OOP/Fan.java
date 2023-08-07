package org.example.OOP;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "BLUE";

    public int getSlow() {
        return slow;
    }
    public int getMedium() {
        return medium;
    }
    public int getFast() {
        return fast;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean getOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double darius) {
        this.radius = darius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){

    }
    public String toString(){
        if (getOn()){
            return ("Speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius + " fan is on");
        } else {
            return ("color: " + this.color + ", radius: " + this.radius + " fan is off");
        }
    }
    public static void main(String[] args){
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("YELLOW");
        fan1.setOn(true);
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("BLUE");
        fan2.setOn(false);
        System.out.println(fan2);
    }
}
