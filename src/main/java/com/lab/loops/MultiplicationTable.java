package com.lab.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to print its multiplication table:");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table of " + number + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        scanner.close();
    }
}
