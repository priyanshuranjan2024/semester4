package lab12;

import java.sql.*;

public class DisplayStudentRecords {
    private static final String URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        String query = "SELECT * FROM student";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            System.out.println("Roll No | Name | Marks");
            System.out.println("-----------------------");
            
            while (rs.next()) {
                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                
                System.out.printf("%d | %s | %d%n", rollno, name, marks);
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
