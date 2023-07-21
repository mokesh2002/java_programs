import java.util.*;
class Bob
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Shops");
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int jump=arr[0];
        if(arr[0]==0)
        {
            System.out.println("-1");
            return;
        }
        int count=0,i=0;
        while(i<n)
        {
            count++;
            i=i+jump;
        }
        if(count>0)
        {
        System.out.println("No of steps Bob reached to his wife :44"+count);
        }
        else
        {
            System.out.println("-1");
        }
    }
}