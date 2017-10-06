package com.timbuchalka;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using  arrays  that sorts a list  of  integers in descending order.
        //Implement the following methods - getIntegers, printArray and sortIntegers.
        // getIntegers returns an array of entered integers from keyboard.
        //sortIntegers should sort the array and return a new array containing the sorted numbers.
        //printArray prints out the contents of the array.

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values");
        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();
        }
        return array;

    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Element " + i + " The number was " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {

            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
