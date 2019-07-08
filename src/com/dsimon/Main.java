package com.dsimon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers(5);

        printIntegers(array);

        int[] sortedArray = sortIntegers(array);

        printIntegers(sortedArray);
    }

    public static int[] getIntegers(int arrayLength) {
        System.out.println("Enter " + arrayLength + " integers:");
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++ ) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printIntegers(int[] array) {
        for (int i = 0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        boolean sorted = false;

        int[] copiedArray = Arrays.copyOf(array, array.length);
        // Built in method to make a copy of an array!!

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int number = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = number;
                    sorted = false;
                }

            }
        }

        return array;
    }
}
