import java.util.*;
class BinaryForm 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary Form of Integer");
        int bin=sc.nextInt();
        String num=Integer.toString(bin);
        int n=num.length();
        int v=0;
        double result=0;
        for(int i=0;i<n;i++)
        { 
            v=bin%10;
            if (v==1)
            {
               result=result+Math.pow(2,i);
               bin=bin/10;
            }
            else
            {
                bin=bin/10;
            }
             
        }
        System.out.println((int)result);
    }
}

