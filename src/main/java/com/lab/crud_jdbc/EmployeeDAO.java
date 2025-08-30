package com.lab.crud_jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employee (emp_id, emp_name, dept_id, salary) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, emp.getEmpId());
            ps.setString(2, emp.getEmpName());

            if (emp.getDeptId() != null && !emp.getDeptId().isEmpty()) {
                ps.setString(3, emp.getDeptId());
            } else {
                ps.setNull(3, java.sql.Types.VARCHAR);
            }

            ps.setBigDecimal(4, emp.getSalary());

            ps.executeUpdate();
            System.out.println("Employee added successfully.");

        } catch (SQLException e) {
            System.err.println("Error inserting employee: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateEmployeeSalary(String empId, BigDecimal newSalary) {
        String sql = "UPDATE employee SET salary = ? WHERE emp_id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setBigDecimal(1, newSalary);
            ps.setString(2, empId);
            ps.executeUpdate();
            System.out.println("Employee salary updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteEmployee(String empId) {
        String sql = "DELETE FROM employee WHERE emp_id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, empId);
            ps.executeUpdate();
            System.out.println("Employee deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void viewAllEmployees() {
        String sql = "SELECT e.emp_id, e.emp_name, e.salary, d.dept_name " +
                "FROM employee e JOIN department d ON e.dept_id = d.dept_id";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.printf("%s | %s | %s | %s%n",
                        rs.getString("emp_id"),
                        rs.getString("emp_name"),
                        rs.getBigDecimal("salary"),
                        rs.getString("dept_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void getEmployeesByDepartment(String deptId) {
        String sql = "SELECT emp_id, emp_name, salary FROM employee WHERE dept_id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, deptId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.printf("%s | %s | %s%n",
                        rs.getString("emp_id"),
                        rs.getString("emp_name"),
                        rs.getBigDecimal("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
