package com.lab.crud_jdbc;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDAO deptDAO = new DepartmentDAO();
        EmployeeDAO empDAO = new EmployeeDAO();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Department");
            System.out.println("2. Add Employee");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. View All Employees");
            System.out.println("6. View Employees by Department");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Dept ID: "); String did = sc.nextLine();
                    System.out.print("Dept Name: "); String dname = sc.nextLine();
                    deptDAO.addDepartment(new Department(did, dname));
                    break;
                case 2:
                    System.out.print("Emp ID: ");
                    String eid = sc.nextLine();
                    System.out.print("Emp Name: ");
                    String ename = sc.nextLine();
                    System.out.print("Dept ID: ");
                    String edip = sc.nextLine();
                    System.out.print("Salary: ");
                    BigDecimal sal = sc.nextBigDecimal();
                    empDAO.addEmployee(new Employee(eid, ename, edip, sal));
                    break;
                case 3:
                    System.out.print("Emp ID: ");
                    String uid = sc.nextLine();
                    System.out.print("New Salary: ");
                    BigDecimal newSalary = sc.nextBigDecimal();
                    empDAO.updateEmployeeSalary(uid, newSalary);
                    break;
                case 4:
                    System.out.print("Emp ID to delete: ");
                    String delid = sc.nextLine();
                    empDAO.deleteEmployee(delid);
                    break;
                case 5:
                    empDAO.viewAllEmployees();
                    break;
                case 6:
                    System.out.print("Dept ID: ");
                    String dipsearch = sc.nextLine();
                    empDAO.getEmployeesByDepartment(dipsearch);
                    break;
                case 7:
                    System.out.println("Exiting the program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
