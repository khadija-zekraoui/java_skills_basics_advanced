package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {

        int numberOfElements = readInteger();
        int[] elements = readElements(numberOfElements);
        System.out.println(Arrays.toString(elements));
        System.out.printf("The min of this numbers is: %d", findMin(elements));

    }

    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");

        return scanner.nextInt();
    }

    private static int[] readElements(int numberOfElements) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %d numbers:%n", numberOfElements);

        int[] elements = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {

            System.out.printf("Number %d:", i);
            elements[i] = scanner.nextInt();
        }

        return elements;
    }

    private static int findMin(int[] elements) {
        int min = Integer.MAX_VALUE;

        for (int el : elements) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}
