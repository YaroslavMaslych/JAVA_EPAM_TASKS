package com.group1;

class Shape {
    private String color;

    Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class=" + this.getClass() + "; color=" + color;
    }

    double calcArea() {
        return 0.0;
    }
}
