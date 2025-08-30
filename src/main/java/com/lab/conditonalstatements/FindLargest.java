package com.lab.conditonalstatements;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers to find the largest number:");
        System.out.println("Enter 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter 3rd number:");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is " + num2);
        } else {
            System.out.println("The largest number is " + num3);
        }

        scanner.close();
    }
}
