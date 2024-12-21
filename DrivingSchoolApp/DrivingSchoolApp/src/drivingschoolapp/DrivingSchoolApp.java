/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drivingschoolapp;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DrivingSchoolApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Driving School - Add Student");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel lastnameLabel = new JLabel("Last Name:");
        JTextField lastnameField = new JTextField(20);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(20);
        
        JLabel DateOfBirthLabel = new JLabel("Date of Birth:");
        JTextField DateOfBirthField = new JTextField(20);
        
        JLabel cityLabel = new JLabel("City:");
        JTextField cityField = new JTextField(20);

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField(20);
        
        JLabel PostalCodeLabel = new JLabel("Postal code:");
        JTextField PostalCodeField = new JTextField(20);
        
        JLabel phoneNumberLabel = new JLabel("Phone number:");
        JTextField phoneNumbereField = new JTextField(20);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener((ActionEvent e) -> {
            String name = nameField.getText();
            
            String last_name = lastnameField.getText();
            
            int age = Integer.parseInt(ageField.getText());
            
            String date_of_birth=DateOfBirthField.getText();
            
            String city = cityField.getText();            
            
            String address = addressField.getText();

            int postal_code=Integer.parseInt(PostalCodeField.getText());
                    
            String phone_number = phoneNumbereField.getText();            
            
            StudentsDAO.addStudent(name,last_name,age,city,address, date_of_birth,postal_code ,phone_number);
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(lastnameLabel);
        panel.add(lastnameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(DateOfBirthLabel);
        panel.add(DateOfBirthField);
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(PostalCodeLabel);
        panel.add(PostalCodeField);
        panel.add(phoneNumberLabel);
        panel.add(phoneNumbereField);
        panel.add(saveButton);

        frame.setVisible(true);
    }
    
}
