package Progamme19Cylinder;

public class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    //1 method get height no params
    public double getHeight() {
        return height;
    }

    //2 get volume method no param
    public double getVolume() {
        double volume = super.getArea() * this.height;
        return volume;
    }
}