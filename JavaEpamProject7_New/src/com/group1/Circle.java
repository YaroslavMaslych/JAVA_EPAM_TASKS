package com.group1;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double calcArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return super.toString() + " radius= " + radius;
    }
}
