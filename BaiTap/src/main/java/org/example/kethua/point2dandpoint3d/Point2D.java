package org.example.kethua.point2dandpoint3d;

public class Point2D {
    public float x;
    public float y;
    public Point2D(){
        x = 0.0f;
        y = 0.0f;
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getXY(){
        return x * y;
    }
    public String toString(){
        return "Point2D x: " + this.x + ", y: " + this.y + ", XY: " + getXY();
    }
}
