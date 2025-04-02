package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel label1 = new JLabel("Enter First Number:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Enter Second Number:");
        JTextField textField2 = new JTextField();
        JLabel label3 = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton resetButton = new JButton("Reset");

        addButton.addActionListener(e -> performOperation(textField1, textField2, resultField, "+"));
        subButton.addActionListener(e -> performOperation(textField1, textField2, resultField, "-"));
        mulButton.addActionListener(e -> performOperation(textField1, textField2, resultField, "*"));
        
        resetButton.addActionListener(e -> {
            textField1.setText("");
            textField2.setText("");
            resultField.setText("");
        });

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(resultField);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(resetButton);

        frame.setVisible(true);
    }

    private static void performOperation(JTextField textField1, JTextField textField2, JTextField resultField, String operation) {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double result = 0;

            switch (operation) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
            }
            
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
