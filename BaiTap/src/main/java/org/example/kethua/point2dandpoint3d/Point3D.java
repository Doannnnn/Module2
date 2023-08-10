package org.example.kethua.point2dandpoint3d;

public class Point3D extends Point2D{
    public float z;
    public Point3D(float z, float x, float y){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void serXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float getXYZ(){
        return x * y * z;
    }
    public String toString(){
        return "Point3D x: " + this.x + ", y: " + this.y + "; z: " + this.z + ", XYZ: " + getXYZ();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 4);
        System.out.println(point2D);
        Point3D point3D = new Point3D(5,6,7);
        System.out.println(point3D);
    }
}
