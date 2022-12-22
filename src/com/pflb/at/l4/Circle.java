package com.pflb.at.l4;


public class Circle implements Geom {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius +
                "\nhas area = " + getArea() + "" +
                "\nand perimetr = " + getPerimetr();
    }
}
