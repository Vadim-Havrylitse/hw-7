package com.company;

public class Circle extends Shape {
    private Point O;
    private double R;

    public Circle() {

    }

    public Circle(Point O, float R) {
        this.O = O;
        this.R = R;
    }

    public Point getO() {
        return O;
    }

    public void setO(Point o) {
        O = o;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public double area() {
        return 2 * Math.PI * R;
    }

    @Override
    public Point middleOfShape() {
        return this.getO();
    }

}
