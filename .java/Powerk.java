import java.util.*;
class Powerk
{
  public static void main(String args[])
{
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the number");
   int n= sc.nextInt();
   int flag=0;
   for(int i=1;i<n;i++)
   {
   for(int j=1;j<n;j++)
   {
    if(Math.pow(i,i)==n-Math.pow(j,2))
	{
		flag=1;
	  System.out.println("YES");
	  System.out.println("K :"+i);
	  System.out.println("d :"+j);
	  return;
	}
	}
	}
	if(flag!=1)
	{
		System.out.println("No");
	}
	}
}
   