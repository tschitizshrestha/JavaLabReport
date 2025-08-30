package com.lab.functions;

import java.util.Scanner;

public class ArithmeticOperation {
    static int num1 = 0;
    static int num2 = 0;

    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    numberIO(scanner);
                    System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                    break;
                case 2:
                    numberIO(scanner);
                    System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                    break;
                case 3:
                    numberIO(scanner);
                    System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                    break;
                case 4:
                    numberIO(scanner);
                    System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                    break;
                case 5:
                    flag = false;
                    System.out.println("Exiting the program....");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void numberIO(Scanner scanner) {
        System.out.println("Enter 1st number:");
        num1 = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        num2 = scanner.nextInt();
    }
}
