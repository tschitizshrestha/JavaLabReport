package com.lab.functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to find its factorial: ");
        int num = scanner.nextInt();

        int fact = factorial(num);

        System.out.println("The factorial of " + num + " is " + fact);

        scanner.close();
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
