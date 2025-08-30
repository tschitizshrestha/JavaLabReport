package com.lab.oop;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlysalary) {
        super(id, name);
        this.monthlySalary = monthlysalary;
    }

    @Override
    public void calculateSalary() {
        setSalary(monthlySalary);
    }
}
