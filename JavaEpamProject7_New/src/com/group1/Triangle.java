package com.group1;

import java.util.Objects;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(String color, double a, double b, double c) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.b, b) == 0 &&
                Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), a, b, c);
    }

    @Override
    public String toString() {
        return super.toString() + " a= " + a + " b= " + b + " c= " + c;
    }
}
