import java.util.*;
class Distance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ways to reach the Destination :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Kilometres :");
        if(n<2)
        {
            System.out.println("Invalid Input");
            return;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]+" "+arr[1]);
    }
}
