package com.company;

//точка А всегда обозначает прямой угол!!!

public class RightTriangle extends Triangle {
    public RightTriangle() {
    }

    public RightTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    public double area() {
        return (Point.lineLength(this.getA(), this.getB()) * Point.lineLength(this.getA(), this.getC())) / 2;
    }


}
