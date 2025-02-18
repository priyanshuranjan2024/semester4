package lab7;

import java.io.*;
import java.util.Scanner;

public class ques2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get source file name
        System.out.print("Enter the source file name: ");
        String sourceFile = scanner.nextLine();
        
        // Get destination file name
        System.out.print("Enter the destination file name: ");
        String destinationFile = scanner.nextLine();
        
        // Copy using character stream
        try (FileReader fr = new FileReader(sourceFile); FileWriter fw = new FileWriter(destinationFile)) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            System.out.println("File copied using character stream.");
        } catch (IOException e) {
            System.out.println("Error copying file using character stream: " + e.getMessage());
        }
        
        // Copy using byte stream
        try (FileInputStream fis = new FileInputStream(sourceFile); FileOutputStream fos = new FileOutputStream(destinationFile)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied using byte stream.");
        } catch (IOException e) {
            System.out.println("Error copying file using byte stream: " + e.getMessage());
        }
        
        scanner.close();
    }
 
}
