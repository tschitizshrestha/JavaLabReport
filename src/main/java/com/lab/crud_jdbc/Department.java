package com.lab.crud_jdbc;

public class Department {
    private int id;
    private String deptId;
    private String deptName;

    public Department( String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public String getDeptId() { return deptId; }
    public String getDeptName() { return deptName; }
}
