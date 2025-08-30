package com.lab.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array");

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The smallest element is " + smallest);
        System.out.println("The largest element is " + largest);

        scanner.close();
    }
}
