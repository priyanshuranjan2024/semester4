package lab11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class three {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();
        scanner.close();
        
        File file = new File(filename);
        
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }
        
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }
        
        System.out.println("No. of characters - " + charCount);
        System.out.println("No. of lines - " + lineCount);
        System.out.println("No. of words - " + wordCount);
    }
    
}
