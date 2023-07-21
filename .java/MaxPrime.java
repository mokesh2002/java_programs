import java.util.*;
class MaxPrime
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the  starting number :");
        int start=sc.nextInt();
        System.out.print("Enter the  Ending number  :");
        int end=sc.nextInt();
        int temp=0;
        if(start<1 || end<1 ||  end<=start)
        {
            System.out.print("Invalid Inputs");
            return;
        }
        for(int i=start;i<end;i++)
        {
            int flag=0;
            for(int j=2;j<=i/2;j++)
            {
             if(i%j==0)
             {
                flag=1;
             }
            }
            if(flag!=1)
            {
            temp=Math.max(temp,i);
            }
       }
        if(temp>0)
        {
        System.out.println("The maximum prime number is "+temp);
        }
        else
        {
            System.out.println("Not Found");
        }
}
}