import java.util.Scanner;
import java.util.HashMap;

public class ques5 {

    public static int findCount(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) count++;

        }

        return count;
    }


    public static void findCountMap(int arr[]){
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        
        for(int key:map.keySet()){
            System.out.println("Count of "+key+" is: "+map.get(key));
        }

        
    }

    
   

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        // for(int i=0;i<arr.length;i++){
        //     System.out.println("Count of "+arr[i]+" is: "+findCount(arr,arr[i]));
        // }

        findCountMap(arr);

        sc.close();
    }
    
}
