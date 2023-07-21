import java.util.*;
class disarium
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count_digits = Integer.toString(n).length();
	int k ,sum=0;
	for(int i=0;i<n;i++)
	{
	   k=n%10;
       sum=(int)(sum+ Math.pow(k, count_digits--));
       n=n/10;
	}
	if(sum==n)
	   System.out.println("disarium number");
	   else
	   System.out.println("Not a disarium number");
	   }
	   }
	   
      	   