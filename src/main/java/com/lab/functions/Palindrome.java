package com.lab.functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();


        if (isPalindrome(string)) {
            System.out.println("The string " + string + " is palindrome");
        } else {
            System.out.println("The string " + string + " is not palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
