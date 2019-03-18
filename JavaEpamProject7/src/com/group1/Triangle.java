package com.group1;

import static java.lang.StrictMath.pow;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + "; a=" + a + "; b=" + b + "; c=" + c;
    }

    @Override
    double calcArea() {
        double p = (a + b + c) / 2;
        return pow((p * (p - a) * (p - b) * (p - c)), 0.5);
    }
}
