package com.group1;

public class Circle extends Shape {
    private double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "; radius=" + radius;
    }

    @Override
    double calcArea() {
        return Math.PI * radius * radius;
    }
}
