package com.company;

public abstract class Shape implements ShapeInterface {

    public void printName() {
        System.out.println(this.getClass().getName().substring(12));
    }


}
