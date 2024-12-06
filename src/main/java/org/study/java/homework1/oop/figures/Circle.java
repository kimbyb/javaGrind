package org.study.java.homework1.oop.figures;

public class Circle extends Shape{

    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimether() {
       return 2 * Math.PI * radius;
    }

}
