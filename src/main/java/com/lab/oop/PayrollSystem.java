package com.lab.oop;

public class PayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee(1, "Ram Thapa", 100000);
        PartTimeEmployee pte = new PartTimeEmployee(2, "Sita Shrestha", 300, 155);

        fte.calculateSalary();
        pte.calculateSalary();

        fte.displayEmployeeDetails();
        System.out.println();
        pte.displayEmployeeDetails();

    }
}
