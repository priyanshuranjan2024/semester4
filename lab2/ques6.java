import java.util.Scanner;

public class ques6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int left=0,right=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    left+=arr[i][j];
                }
                if(i+j==2)
                {
                    right+=arr[i][j];
                }
            }
        }

        System.out.println("Left Diagonal: "+left);
        System.out.println("Right Diagonal: "+right);

        sc.close();
    }

    
}
