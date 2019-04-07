package com.group1;

import java.util.Arrays;

public class Main {
    private static void view(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Area=" + shape.calcArea());
        }
    }

    private static void allArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calcArea();
        }
        System.out.println(area);
    }

    private static double[] areas(Shape[] shapes) {
        int r = 0;
        int t = 0;
        int c = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle)
                c = 1;
            if (shape instanceof Rectangle)
                r = 1;
            if (shape instanceof Triangle)
                t = 1;
        }
        double[] area = new double[r + t + c];
        int k = 0;
        int x = -1;
        int y = -1;
        int z = -1;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                if (x == -1) {
                    x = k;
                    k++;
                }
                area[x] += shape.calcArea();
            }
            if (shape instanceof Rectangle) {
                if (y == -1) {
                    y = k;
                    k++;
                }
                area[y] += shape.calcArea();
            }
            if (shape instanceof Triangle) {
                if (z == -1) {
                    z = k;
                    k++;
                }
                area[z] += shape.calcArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle("Red", 5, 6),
                new Rectangle("Yellow", 5, 6),
                new Rectangle("Green", 5, 6),
                new Rectangle("Gold", 5, 6),
                new Circle("Blue", 4),
                new Circle("White", 4),
                new Circle("Pink", 4),
                new Triangle("Black", 3, 4, 5),
                new Triangle("Violet", 3, 4, 5),
        };

        Main.view(shapes);
        System.out.println();
        Main.allArea(shapes);
        System.out.println();
        System.out.println(Arrays.toString(Main.areas(shapes)));
    }
}
