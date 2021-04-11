package com.company;

public abstract class Triangle extends Shape {
    private Point A, B, C;

    public Triangle() {

    }

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    @Override
    public Point middleOfShape() {
        Point halfAB = Point.middlePoint(this.getA(), this.getB());
        Point halfBC = Point.middlePoint(this.getB(), this.getC());
        return Point.intersectionPoint(this.getA(), halfAB, halfBC, this.getC());
    }

}
