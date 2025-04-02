package lab12;

import java.sql.*;
import java.util.Scanner;

public class StudentDBOperations {
    private static final String URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("Choose an operation: \n1. Insert\n2. Update\n3. Delete\n4. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        insertRecord(conn, scanner);
                        break;
                    case 2:
                        updateRecord(conn, scanner);
                        break;
                    case 3:
                        deleteRecord(conn, scanner);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    private static void insertRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter rollno to be inserted: ");
        int rollno = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        String query = "INSERT INTO student (rollno, name, marks) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, rollno);
            pstmt.setString(2, name);
            pstmt.setInt(3, marks);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " record inserted.");
        }
    }

    private static void updateRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter rollno to update: ");
        int rollno = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new marks: ");
        int marks = scanner.nextInt();

        String query = "UPDATE student SET marks = ? WHERE rollno = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, marks);
            pstmt.setInt(2, rollno);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " record updated.");
        }
    }

    private static void deleteRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter rollno to delete: ");
        int rollno = scanner.nextInt();

        String query = "DELETE FROM student WHERE rollno = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, rollno);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " record deleted.");
        }
    }
}
