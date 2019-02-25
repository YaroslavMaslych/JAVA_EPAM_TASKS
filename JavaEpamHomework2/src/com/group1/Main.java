package com.group1;

public class Main {

    public static void main(String[] args) {

        //Первое задание

        int var1 = 20;
        int var2 = 30;

        var1 += var2;
        var2 -= var1;
        var2 = var2 * (-1);
        var1 = var1 - var2;

        System.out.println(var1 + " " + var2 + "\n");

        //Второе задание

        int number =123;

        System.out.println((99 * ((number / 100) - (number % 10))) + "\n");

        //Третье задание

        float lbs = 12.0f;
        int kilos = (int) (lbs * 0.4536f);
        int grams = (int) (lbs * 453.6f - kilos*1000);

        System.out.println(kilos + " кг и " + grams + " г\n");

        // Четвертое задание

        int mm = 6;
        int perc = 12;
        float money = 10000f;
        System.out.println("Прибыль: " + money * perc / 100 * mm / 12);

    }
}
