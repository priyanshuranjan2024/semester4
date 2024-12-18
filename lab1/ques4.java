package lab1;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the palindrome number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev=0;
        while(temp!=0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp = temp/10;
        }

        if(rev==num){
            System.out.println("The number is a palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }

        sc.close();

    }
    
}
