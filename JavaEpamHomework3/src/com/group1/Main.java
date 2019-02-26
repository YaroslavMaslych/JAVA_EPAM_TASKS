package com.group1;

public class Main {

    public static void main(String[] args) {
        int width = 9;

        System.out.println("a) triangles\n");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++)
                if (j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        for (int i = width - 1; i > -1; i--) {
            for (int j = 0; j < width; j++)
                if (j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println("\nb) triangles\n");
        for (int i = width - 1; i > -1; i--) {
            for (int j = width - 1; j > -1; j--)
                if (j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println("\nc) triangles\n");
        for (int i = 0; i < width; i++) {
            for (int j = width - 1; j > -1; j--)
                if (j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println("\nd) triangles\n");
        for (int i = 0; i < width; i++) {
            for (int j = width - 1; j > -1; j--)
                if (j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        for (int i = width - 1; i > -1; i--) {
            for (int j = width - 1; j > -1; j--)
                if (j <= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println("\ne) triangles\n");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < (width * 2); j++)
                if (((width - 1 >= j) && (i >= width - 1 - j)) || ((j >= width)&&(i >= j - width)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < (width * 2); j++)
                if (((width - 1 >= j) && (i >= width - 1 - j)) || ((j >= width)&&(i >= j - width)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }
}
