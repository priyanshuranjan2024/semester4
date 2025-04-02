package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Full Name:");
        JTextField textField = new JTextField(20);
        
        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(3, 20);
        
        JCheckBox checkBox = new JCheckBox("Subscribe to Newsletter");
        
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JButton submitButton = new JButton("Submit");
        
        JLabel imageLabel = new JLabel(new ImageIcon("image.png")); // Replace with actual image path
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String address = addressArea.getText();
                String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not selected";
                String subscribed = checkBox.isSelected() ? "Yes" : "No";
                
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nAddress: " + address +
                        "\nGender: " + gender + "\nSubscribed: " + subscribed);
            }
        });
        
        frame.add(label);
        frame.add(textField);
        frame.add(addressLabel);
        frame.add(addressArea);
        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);
        frame.add(checkBox);
        frame.add(submitButton);
        frame.add(imageLabel);
        
        frame.setVisible(true);
    }
}

