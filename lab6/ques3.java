// Aim of the program- Write a Java class which has a method called
// ProcessInput(). This method checks the number entered by the user. If the
// entered number is negative then throw an user defined exception called
// NegativeNumberException, otherwise it displays the double value of the entered
// number. 

import java.util.*;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String s){
        super(s);
    }
}

public class ques3 {

    // Method to process the input
    public void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        } else {
            System.out.println("Double of the entered number: " + (number * 2));
        }
    }

    //main method with try and catch block
    // Main method
    public static void main(String[] args) {
        ques3 processor = new ques3();

        try {
            // Example input (can replace with user input logic)
            int number = -5; // Change this to test with other values
            processor.ProcessInput(number);
        } catch (NegativeNumberException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
    
}
