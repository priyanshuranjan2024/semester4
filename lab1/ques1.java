package lab1;
import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Roll Number: ");
        String roll = sc.nextLine();
        System.out.println("Enter your Section: ");
        String section = sc.nextLine();
        System.out.println("Enter your Branch: ");
        String branch = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
        sc.close();

        
    }
}