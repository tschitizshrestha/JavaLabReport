package com.lab.oop;

public class PayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee(1, "David", 30000);
        PartTimeEmployee pte = new PartTimeEmployee(2, "Daniel", 70, 300);

        fte.calculateSalary();
        pte.calculateSalary();

        fte.displayEmployeeDetails();
        System.out.println();
        pte.displayEmployeeDetails();

    }
}
