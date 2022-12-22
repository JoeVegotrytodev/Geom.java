package com.pflb.at.l4;
import java.lang.Math.*;

public class Rectangle implements Geom{

    private double width;
    private double high;

    public Rectangle(double width, double high){
        this.width = width;
        this.high = high;
    }

    @Override
    public double getArea() {
        return high * width;
    }

    @Override
    public double getPerimetr() {
        return (2 * high) + (2 * width);
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + " and high " + high +
                "\nhas area = " + getArea() + "" +
                "\nand perimetr = " + getPerimetr();
    }
}
