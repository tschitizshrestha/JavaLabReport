package com.lab.conditonalstatements;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("The Number " + num + " is even.");
        } else {
            System.out.println("The Number " + num + " is odd.");
        }

        scanner.close();
    }
}
