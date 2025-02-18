package lab7;

import java.io.*;
import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept student details
        System.out.print("Enter student Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        System.out.print("Enter student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        
        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Get filename from user
        System.out.print("Enter the name of the file to store details: ");
        String fileName = scanner.nextLine();
        
        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(rollNo + "," + name + "," + subject + "," + marks);
            writer.newLine();
            System.out.println("Student details saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Read from file and display content
        System.out.print("Enter the name of the file to read details: ");
        String readFileName = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(readFileName))) {
            System.out.println("\nStudent Details from file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        
        scanner.close();
    }
    
}
