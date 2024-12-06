package org.study.java.homework1.oop.figures;

public class Rectangle extends Shape{

    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimether() {
        return 2 * (width + height);
    }
}
