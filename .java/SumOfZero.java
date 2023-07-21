import java.util.*;
class SumOfZero
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the  size of array:");
        int n=sc.nextInt();
        System.out.print("Enter the  array elemnts  :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        System.out.println("Elements are "+arr[i]+" "+arr[j] +" "+arr[k]); 
                        flag=1;
                    }
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Not Found");
        }
    }
}