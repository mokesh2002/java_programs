import java.util.*;
class powek
{
	public int knum(int i)
	{
		int k=i,j=1;
		while(i>0)
		{
	       j=j*k;
		   i--;
		}
		return j;
       	   
	}
}
class Power
{
  public static void main(String args[])
{
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the number");
   int n= sc.nextInt();
   int flag=0;
   powek sv=new powek();
   for(int i=1;i<n;i++)
   {
   for(int j=1;j<n;j++)
   {
    
    if(sv.knum(i)==n-(j*j))
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
   