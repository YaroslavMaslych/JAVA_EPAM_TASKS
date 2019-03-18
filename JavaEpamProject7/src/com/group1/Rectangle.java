package com.group1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public String toString() {
        return super.toString() + "; height=" + height + "; width=" + width;
    }

    @Override
    double calcArea() {
        return width * height;
    }
}
