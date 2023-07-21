import java.util.*;
class prices
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Transaction");
        int k=sc.nextInt();
        int profit=0;
        int i=0;
        while(i<n-1)
        {
          if(arr[i+1]>arr[i])
          {
          profit=profit + (arr[i+1]-arr[i]);
          }
           i++;
        }
        
    
        System.out.println(profit);
    }
}