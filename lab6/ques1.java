// Write a Java program to generate an
// ArrayIndexOutofBoundsException and handle it using catch statement. Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
// Output: Exception in thread “main”
// java.lang.ArrayIndexOutOfBoundsException:4

import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the size fo the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at index "+i+": ");
            arr[i]=sc.nextInt();
        }
        try{
            System.out.println("Enter the index to access the element: ");
            int index=sc.nextInt();
            System.out.println("Element at index "+index+" is: "+arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: "+e.getMessage());
        }
        sc.close();
    }
}