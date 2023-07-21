import java.util.*;
class totalSales
{
    public int highestselling(int n,int arr[])
    {
        int temp=0;
     for(int i=0;i<n;i++)
     {
        for(int j=1; j < (n-i); j++)
        {  
            if(arr[j-1] < arr[j])
            {   
                   temp = arr[j-1];  
                   arr[j-1] = arr[j];  
                   arr[j] = temp;  
            }
        }
    }
    int result=arr[0]+arr[1];
    return result;  

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  no of products :");
        int n=sc.nextInt();
        int arr[]=new int[10];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        totalSales sv=new totalSales();
        int result=sv.highestselling(n,arr);
        System.out.println(result);

    }
}