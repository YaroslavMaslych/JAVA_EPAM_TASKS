package com.group1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width");
        int width = sc.nextInt();
        System.out.println("a");
        while (i < width) {
            write(0, i, width);
            i++;
        }
        i = width - 1;
        while (i >= 0) {
            write(0, i, width);
            i--;
        }
        System.out.println("b");
        i = width - 1;
        while (i >= 0) {
            write(1, i, width);
            i--;
        }
        System.out.println("c");
        i=0;
        while (i < width) {
            write(1, i, width);
            i++;
        }
        System.out.println("d");
        i=0;
        while (i < width) {
            write(1, i, width);
            i++;
        }
        i = width - 1;
        while (i >= 0) {
            write(1, i, width);
            i--;
        }
        System.out.println("e");
        superwrite(width);
        superwrite(width);

    }

    static public void write(int side, int length, int width) {
        if (side == 0) {
            int i = 0;
            while (i < width) {
                if (i <= length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                i++;
            }
        } else {
            int i = width - 1;
            while (i >= 0) {
                if (i > length) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                i--;
            }
        }
        System.out.println();
    }

    static public void superwrite(int size) {
        int i = 0;
        int k = 0;

        while (i < size) {
            while (k < size * 2) {
                if (k < size) {
                    if (k >= size - i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (k - size > i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                k++;
            }
            System.out.println();
            k=0;
            i++;
        }
    }
}
