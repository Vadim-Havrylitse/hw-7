package com.company;

public class Ellipse extends Shape{
    private Point O;
    private double R1;
    private double R2;

    public Ellipse (){

    }
    public Ellipse(Point o, double r1, double r2) {
        O = o;
        R1 = r1;
        R2 = r2;
    }

    public Point getO() {
        return O;
    }

    public void setO(Point o) {
        O = o;
    }

    public double getR1() {
        return R1;
    }

    public void setR1(double r1) {
        R1 = r1;
    }

    public double getR2() {
        return R2;
    }

    public void setR2(double r2) {
        R2 = r2;
    }

    @Override
    public double area() {
        return Math.PI*R1*R2;
    }

    @Override
    public Point middleOfShape() {
        return O;
    }
}
