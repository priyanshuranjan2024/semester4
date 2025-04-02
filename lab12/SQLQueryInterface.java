package lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class SQLQueryInterface {
    private static final String URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "your_username"; //sample changed 
    private static final String PASSWORD = "your_password"; //sample usig from env

    public static void main(String[] args) {
        JFrame frame = new JFrame("SQL Query Executor");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter SQL Query:");
        JTextField queryField = new JTextField(30);
        JButton executeButton = new JButton("Execute Query");
        JTextArea resultArea = new JTextArea(10, 40);
        resultArea.setVisible(false);
        resultArea.setEditable(false);

        frame.add(label);
        frame.add(queryField);
        frame.add(executeButton);
        frame.add(new JScrollPane(resultArea));

        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = queryField.getText();
                executeQuery(query, resultArea);
            }
        });

        frame.setVisible(true);
    }

    private static void executeQuery(String query, JTextArea resultArea) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            StringBuilder result = new StringBuilder();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    result.append(metaData.getColumnName(i)).append(": ").append(rs.getString(i)).append("\n");
                }
            }
            
            if (result.length() == 0) {
                result.append("No results found.");
            }
            
            resultArea.setText(result.toString());
            resultArea.setVisible(true);
        } catch (SQLException ex) {
            resultArea.setText("Error executing query: " + ex.getMessage());
            resultArea.setVisible(true);
        }
    }
}
