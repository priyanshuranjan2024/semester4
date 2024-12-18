import java.util.Scanner;

//find the no. of objects created out of a class using "static modifier"

public class ques4 {

    static int count=0;

    public static class test{
        test(){
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        test obj[]=new test[n];
        for(int i=0;i<n;i++)
        {
            obj[i]=new test();
        }

        System.out.println("No. of objects created: "+count);

        sc.close();
        
    }


}