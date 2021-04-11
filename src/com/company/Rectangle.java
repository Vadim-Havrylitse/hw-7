package com.company;

public class Rectangle extends Quad{
    public Rectangle() {
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    @Override
    public double area() {
        return Point.lineLength(this.getA(), this.getB()) * Point.lineLength(this.getA(), this.getD());
    }

    @Override
    public Point middleOfShape() {
        //центром будет середина любой диагонали
        return Point.middlePoint(this.getA(), this.getC());
    }
}
