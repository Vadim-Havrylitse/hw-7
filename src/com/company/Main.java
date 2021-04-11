package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shape rectangle = new Rectangle();
        Shape rightTriangle = new RightTriangle();
        Shape equilateralTriangle = new EquilateralTriangle();
        Shape circle = new Circle();
        Shape trapezoid = new Trapezoid();

        rectangle.printName();
        rightTriangle.printName();
        equilateralTriangle.printName();
        circle.printName();
        trapezoid.printName();
    }
}
