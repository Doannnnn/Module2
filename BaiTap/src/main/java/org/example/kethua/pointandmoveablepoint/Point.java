package org.example.kethua.pointandmoveablepoint;

public class Point {
    public float x;
    public float y;
    public Point(){
        x = 0.0f;
        y = 0.0f;
    }
    public Point(float x, float y){
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
    public float getXY(){
        return x * y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point x: " + this.x + ", y: " + this.y + ", XY: " + getXY();
    }
}
