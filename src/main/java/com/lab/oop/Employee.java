package com.lab.oop;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println("Employee Salary: " + salary);

    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: Rs. " + salary);
    }

}
