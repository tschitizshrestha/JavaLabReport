package com.lab.loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number up to which you want to display the Fibonacci series:");
        int num = scanner.nextInt();
        System.out.println("The Fibonacci series up to terms " + num + " :");

        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(num1 + "\t");
            int temp = num1;
            num1 = num2;
            num2 = num1 + temp;
        }

        scanner.close();
    }
}
