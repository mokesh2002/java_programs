import java.util.*;
class perfectsquare
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=0;
	for(int i=1;i<n;i++)
	{
		if(i*i==n)
		{
			s=i;
		}
	}
	if(s*s==n)
	   System.out.println("perfect square");
	   else
	   System.out.println("Not a perfect square");
	 }
	 }
	 