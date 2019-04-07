package com.group1;

import java.util.Objects;

abstract public class Shape implements Comparable {
    String color;

    public abstract double calcArea();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "class= " + this.getClass().getSimpleName() +
                " color= " + color;
    }

    public int compareTo(Object o) {
        if (this.calcArea() > ((Shape) o).calcArea()) return 1;
        if (this.calcArea() < ((Shape) o).calcArea()) return -1;
        return 0;
    }
}
