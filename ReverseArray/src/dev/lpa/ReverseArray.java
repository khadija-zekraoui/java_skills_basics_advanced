package dev.lpa;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] elements = {1,2,3,4,5};
        reverse(elements);
    }

    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));

        int maxIndex = array.length - 1;
        for (int i = 0; i < (array.length / 2) ; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));

    }
}
