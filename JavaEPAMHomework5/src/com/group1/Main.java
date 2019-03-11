package com.group1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Arrs arr1 = new Arrs(5, 0, 10);
        arr1.simpleWrite();
        arr1.reverseWrite();

        System.out.println("Task 2");
        Arrs arr2 = new Arrs(6, -5, 5);
        arr2.simpleWrite();
        arr2.getNumberOfOdds();
        arr2.getSumOfOdds();

        System.out.println("Task 3");
        Arrs arr3 = new Arrs(10, 5, 20);
        arr3.simpleWrite();
        Arrs arr4 = new Arrs(10, 1, 15);
        arr4.simpleWrite();
        Arrs arr5 = new Arrs(arr3.getArr(), arr4.getArr());
        arr5.simpleWrite();

        System.out.println("Task 4");
        Arrs arr6 = new Arrs(20, -10, 10);
        arr6.simpleWrite();
        arr6.divide();
        int[] pArr = arr6.getPositiveArrs();
        System.out.println(Arrays.toString(pArr));
        int[] nArr = arr6.getNegativeArrs();
        System.out.println(Arrays.toString(nArr));

        System.out.println("Additional 1");
        Arrs arr7 = new Arrs(10, -10, 10);
        arr7.simpleWrite();
        System.out.println(arr7.getAvarage());
        arr7.calculateAvarage();
        System.out.println(arr7.getMoreThanAvarage());

        System.out.println("Additional 2");
        Arrs arr8 = new Arrs(4, 1, 10);
        Arrs arr9 = new Arrs(5, 1, 10);
        arr8.simpleWrite();
        arr9.simpleWrite();
        Arrs arr10 = new Arrs(arr8.getArr(), arr9.getArr());
        arr10.simpleWrite();

        System.out.println("Additional 3");
        Arrs arr11 = new Arrs(10, 1, 5);
        arr11.simpleWrite();
        arr11.deleteMaxisMinis();
        arr11.simpleWrite();
    }
}

class Arrs {
    private final int[] arr;
    private int[] positiveArrs;
    private int[] negativeArrs;
    private int odds = 0;
    private int sumOfOdds = 0;
    private int positives = 0;
    private int negatives = 0;
    private double avarage = 0;
    private int moreThanAvarage;

    Arrs(int number, int down, int up) {
        arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = down + (int) (Math.random() * (up - down + 1));
            if (arr[i] % 2 == 1 || arr[i] % 2 == -1) {
                odds++;
                sumOfOdds += arr[i];
            }
            if (arr[i] > 0)
                positives++;
            if (arr[i] < 0)
                negatives++;
            avarage += arr[i];
        }
        avarage /= arr.length;
    }

    Arrs(int[] arrA, int[] arrB) {
        if (arrA.length == arrB.length) {
            arr = new int[arrA.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arrA[i] + arrB[i];
                if (arr[i] % 2 == 1 || arr[i] % 2 == -1) {
                    odds++;
                    sumOfOdds += arr[i];
                }
                if (arr[i] > 0)
                    positives++;
                if (arr[i] < 0)
                    negatives++;
                avarage += arr[i];
            }
            avarage /= arr.length;
        } else {
            arr = new int[arrA.length + arrB.length];
            int a = 0;
            for (int anArrA : arrA) {
                arr[a] = anArrA;
                if (arr[a] % 2 == 1 || arr[a] % 2 == -1) {
                    odds++;
                    sumOfOdds += arr[a];
                }
                if (arr[a] > 0)
                    positives++;
                if (arr[a] < 0)
                    negatives++;
                avarage += arr[a];
                a++;
            }
            for (int anArrB : arrB) {
                arr[a] = anArrB;
                if (arr[a] % 2 == 1 || arr[a] % 2 == -1) {
                    odds++;
                    sumOfOdds += arr[a];
                }
                if (arr[a] > 0)
                    positives++;
                if (arr[a] < 0)
                    negatives++;
                avarage += arr[a];
                a++;
            }
            avarage /= arr.length;
        }
    }

    void simpleWrite() {
        for (int arr : arr) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

   void reverseWrite() {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void getNumberOfOdds() {
        System.out.println(odds);
    }

    void getSumOfOdds() {
        System.out.println(sumOfOdds);
    }

    void divide() {
        positiveArrs = new int[positives];
        negativeArrs = new int[negatives];
        int p = 0;
        int n = 0;
        for (int anArr : arr) {
            if (anArr > 0) {
                positiveArrs[p] = anArr;
                p++;
            }
            if (anArr < 0) {
                negativeArrs[n] = anArr;
                n++;
            }
        }
    }

    void calculateAvarage() {
        for (int member : arr) {
            if (member > avarage)
                moreThanAvarage++;
        }
    }

    void deleteMaxisMinis() {
        int max;
        int min;
        max = arr[0];
        min = arr[0];
        boolean isMin = false;
        boolean isMax = false;
        for (int member : arr) {
            if (member > max)
                max = member;
            if (member < min)
                min = member;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max && !isMax) {
                isMax = true;
                continue;
            }
            if (arr[i] == min && !isMin) {
                isMin = true;
                continue;
            }
            if (arr[i] == max && isMax) {
                arr[i] = 0;
            }
            if (arr[i] == min && isMin) {
                arr[i] = 0;
            }
        }
    }

    int[] getArr() {
        return arr;
    }

    int[] getPositiveArrs() {
        return positiveArrs;
    }

    int[] getNegativeArrs() {
        return negativeArrs;
    }

    double getAvarage() {
        return avarage;
    }

    int getMoreThanAvarage() {
        return moreThanAvarage;
    }
}
