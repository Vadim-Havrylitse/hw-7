package com.company;

public class Trapezoid extends Quad {
    public Trapezoid() {
    }

    public Trapezoid(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    @Override
    public double area() {
        return ((Point.lineLength(this.getA(), this.getD()) + Point.lineLength(this.getB(), this.getC())) / 2)
                * (this.getB().getOy() - this.getA().getOy());
    }

    @Override
    public Point middleOfShape() {
        //ищем точку пересечения диагоналей

        return Point.intersectionPoint(this);
    }
}
