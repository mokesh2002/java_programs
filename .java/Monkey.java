import java.util.*;
class Monkey
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of monkeys :");
        int n=sc.nextInt();
        System.out.print("Enter the no of eatable bananas :");
        int k=sc.nextInt();
        System.out.print("Enter the no of eatable peanuts :");
        int j=sc.nextInt();
        System.out.print("Enter the  total no of bananas :");
        int m=sc.nextInt();
        System.out.print("Enter the total no of peanuts :");
        int p=sc.nextInt();
        int temp=0,result=0,l=0,y=0;
        if(k==0 || j==0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
                 temp=m/k;
                 result=p/j;
                 l=(m%k)+(p%k);
                 y=n-(temp+result);
                 if(l>=k || l>=j)
                 {
                     y--;
                 }
                 System.out.print("The no of monkeys  remaining are:"+y);
        }
            
        }
        
}