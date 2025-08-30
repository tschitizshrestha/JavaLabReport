package com.lab.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> frequencyOfNumber = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (frequencyOfNumber.containsKey(array[i])) {
                frequencyOfNumber.put(array[i], frequencyOfNumber.get(array[i]) + 1);
            } else {
                frequencyOfNumber.put(array[i], 1);
            }
        }

        System.out.println("Frequency of number: ");
        for (Integer key : frequencyOfNumber.keySet()) {
            System.out.println(key + " : " + frequencyOfNumber.get(key));
        }

        scanner.close();
    }
}
