import java.util.Scanner;

public class ques2 {

    public static void main(String[] args) {
        //create a array of size 10 and take input for it
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }

        int odd=0,even=0;

        for(int i=0;i<10;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);


        sc.close();
    }
    
}
