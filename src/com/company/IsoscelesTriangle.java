package com.company;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle() {
    }

    public IsoscelesTriangle(Point a, Point b, Point c) {
        super(a, b, c);
    }

    @Override
    public double area() {
        return 0.5 * Point.lineLength(this.getA(), this.getC())
                * Point.lineLength(this.getB(), Point.middlePoint(this.getA(), this.getC()));
    }


}
