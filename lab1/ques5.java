package lab1;

import java.util.Scanner;

public class ques5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName=sc.nextLine();
        System.out.println("Enter the Last name: ");
        String lastName=sc.nextLine();

        System.out.println(lastName+" "+firstName);

        
        sc.close();


    }
    
}
