package com.lab.crud_jdbc;

import java.math.BigDecimal;

public class Employee {
    private int id;
    private String empId;
    private String empName;
    private String deptId;
    private BigDecimal salary;

    public Employee(String empId, String empName, String deptId, BigDecimal salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.salary = salary;
    }

    public String getEmpId() { return empId; }
    public String getEmpName() { return empName; }
    public String getDeptId() { return deptId; }
    public BigDecimal getSalary() { return salary; }
}
