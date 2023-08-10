package org.example.kethua.pointandmoveablepoint;

public class MoveablePoint extends Point{
    public float xSpeed;
    public float ySpeed;
    public MoveablePoint(){
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getSpeed(){
        return xSpeed * ySpeed;
    }
    public String toString(){
        return "MoveablePoint: " + getX() + ", " + getY() + ", Speed: " + xSpeed + ", " + ySpeed;
    }
    public void move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(2.5f, 3.5f, 1.2f, 0.8f);
        System.out.println("Thông tin ban đầu:");
        System.out.println(point.toString());
        point.move();
        System.out.println("Thông tin sau khi di chuyển:");
        System.out.println(point.toString());
        point.setSpeed(0.5f, -0.3f);
        point.move();
        System.out.println("Thông tin sau khi di chuyển lại:");
        System.out.println(point.toString());
    }
}
