package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] firstArray = getIntegers(3);
        printArray(sortIntegers(firstArray));
    }

    public static int[] sortIntegers(int[] arrayToSort) {
        int[] sortedArray = Arrays.copyOf(arrayToSort, arrayToSort.length);

        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+ 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }

    public static int[] getIntegers(int len) {

        int[] newArray = new int[len];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < len; i++) {
            System.out.printf("Insert the element [%d]:", i);
            newArray[i] = scanner.nextInt();
        }

        return newArray;
    }
}
