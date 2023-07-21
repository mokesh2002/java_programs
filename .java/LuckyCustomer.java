import java.util.*;
class LuckyCustomer
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer Fed to the System :");
        int n=sc.nextInt();
        int k=1,j=1;
        int result=0;
        if(n==2)
        {
             System.out.println("Order ID of Lucky Customer :"+(k+j));
        }
        else
        {
        for(int i=3;i<=n;i++)
        {
             result=k+j;
             k=j;
             j=result;
        }
        System.out.println("Order ID of Lucky Customer :"+result);
       }
    }
}
