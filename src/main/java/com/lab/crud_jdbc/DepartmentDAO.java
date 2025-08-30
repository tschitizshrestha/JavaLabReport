package com.lab.crud_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentDAO {
    public void addDepartment(Department dept) {
        String sql = "INSERT INTO department (dept_id, dept_name) VALUES (?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, dept.getDeptId());
            ps.setString(2, dept.getDeptName());
            ps.executeUpdate();
            System.out.println("Department added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
