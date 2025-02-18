package lab7;

import java.io.*;

public class ques3 {

    public static void main(String[] args) {
        // Specify two binary files
        String file1 = "file1.bin";
        String file2 = "file2.bin";

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {
            
            int bytePos = 0;
            int b1, b2;
            
            while ((b1 = fis1.read()) != -1 && (b2 = fis2.read()) != -1) {
                if (b1 != b2) {
                    System.out.println("Two files are not equal: byte position at which two files differ is " + bytePos);
                    return;
                }
                bytePos++;
            }
            
            // Check if files have different lengths
            if (fis1.read() == -1 && fis2.read() == -1) {
                System.out.println("Two files are equal");
            } else {
                System.out.println("Two files are not equal: byte position at which two files differ is " + bytePos);
            }
            
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
    
}
