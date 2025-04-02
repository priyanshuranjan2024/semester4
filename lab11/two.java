package lab11;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept student details
            System.out.print("Enter Student Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // Consume leftover newline
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // Consume leftover newline

            // File name input
            System.out.print("Enter the name of the existing file to which student details will be written: ");
            String filename = sc.nextLine();

            // Writing student details to file
            FileWriter fw = new FileWriter(filename, true); // true for append mode
            fw.write("Roll No: " + rollNo + ", Name: " + name + ", Subject: " + subject + ", Marks: " + marks + "\n");
            fw.close();
            System.out.println("Student details written to file successfully.\n");

            // Reading and displaying file content
            System.out.println("Displaying the content of file '" + filename + "':\n");
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
