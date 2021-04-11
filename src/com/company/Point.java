package com.company;

public class Point {
    private int Ox;
    private int Oy;

    public Point() {

    }

    public Point(int ox, int oy) {
        Ox = ox;
        Oy = oy;
    }

    public int getOx() {
        return Ox;
    }

    public void setOx(int ox) {
        Ox = ox;
    }

    public int getOy() {
        return Oy;
    }

    public void setOy(int oy) {
        Oy = oy;
    }

    public static double lineLength(Point A, Point B) {
        return Math.sqrt(Math.pow(B.getOx() - A.getOx(), 2) + Math.pow(B.getOy() - A.getOy(), 2));
    }

    //вычисляем точку перечечения отрезков АС и ВD
    public static Point intersectionPoint(Point A, Point B, Point C, Point D) {
        int k1 = (A.Oy - C.Oy) / (A.Ox - C.Ox);
        int k2 = (B.Oy - D.Oy) / (B.Ox - D.Ox);
        int b1 = A.Oy - k1 * A.Ox;
        int b2 = B.Oy - k2 * B.Ox;
        int newX = (b2 - b1) / (k1 - k2);
        int newY = k1 * newX + b1;
        return new Point(newX, newY);
    }

    //Overload
    public static Point intersectionPoint(Quad element){
        return intersectionPoint(element.getA(),element.getB(),element.getC(),element.getD());
    }

    public static Point middlePoint (Point a, Point b){
        int newX = (a.Ox+b.Ox)/2;
        int newY = (a.Oy+b.Oy)/2;
        return new Point(newX, newY);

    }

}
