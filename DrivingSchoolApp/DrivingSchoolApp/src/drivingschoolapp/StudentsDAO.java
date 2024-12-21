/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drivingschoolapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentsDAO {
     public static void addStudent(String name,String last_name,int age,String city, String address, String date_of_birth,int postal_code,String phone_number) {
        String sql = "INSERT INTO students(student name,last name, age,date of birth,city, address,postal code ,phone number ) VALUES(?, ?, ?, ?, datetime('now'))";

        try (Connection conn = DatabaseConnector.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, last_name);
            pstmt.setInt(3,age);
            pstmt.setString(4, date_of_birth);
            pstmt.setString(5, city);
            pstmt.setString(6, address);
            pstmt.setInt(7,postal_code);
            pstmt.setString(8,phone_number);
            
            pstmt.executeUpdate();
            System.out.println("Student added successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting student: " + e.getMessage());
        }
    }
}
