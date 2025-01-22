// Write a Java program to handle an ArithmeticException
// using try, catch, and finally block.

import java.util.Scanner;

public class ques2 {

    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        try{
            int c=a/b;
            System.out.println("Division of a and b is: "+c);
        }catch(ArithmeticException e){
            System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: "+e.getMessage());
        }finally{
            System.out.println("Finally block executed");
        }

        sc.close();
    }

    
}
