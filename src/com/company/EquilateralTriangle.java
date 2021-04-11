package com.company;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle() {
    }

    public EquilateralTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    public double area() {
        return (Math.pow(Point.lineLength(this.getA(), this.getB()), 2) * Math.sqrt(3)) / 4;
    }




}
