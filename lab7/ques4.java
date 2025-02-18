package lab7;

import java.io.*;
import java.util.Scanner;

public class ques4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get file name from user
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        
        int charCount = 0, wordCount = 0, lineCount = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }
            
            System.out.println("No. of characters - " + charCount);
            System.out.println("No. of lines - " + lineCount);
            System.out.println("No. of words - " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        scanner.close();
    }
    
}
