import java.util.*;
class Rangevalues
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int start[]=new int[10];
	int end[]=new int[10];
    int i=0;
	 System.out.println("if you want continue enter  1 \n or Enter 0 to break");
	 
	while(i>=0)
	{
    System.out.println("Enter choices :");
	int sv=sc.nextInt();
	if(sv==1)
	{
		System.out.print("Enter Start Range :");
	    int start1=sc.nextInt();
		System.out.print("Enter End Range :");
		int end1=sc.nextInt();
	    start[i]=start1;
		end[i]=end1;
		if(i==0)
		{
			System.out.println("Range \n"+start[i]+"-"+end[i]);
		}
		else
		{
		for(int j=0;j<i;j++)
		{
	     if(start[i]<start[j] && end[i]>end[j])
		 {
		    System.out.println("Range \n"+start[j]+"-"+end[i]);
		 }
		 else if(start[i]<start[j] || end[i]<end[j])
		 {
			  System.out.println("Range");
			  System.out.println(start[j]+"-"+end[j]);
		 }
		 else if(start[i]>start[j] && end[i]>end[j])
		 {
			System.out.println("Range");
		    for(int k=0;k<=i;k++)
			{
			System.out.println(start[k]+"-"+end[k]);
			}
	     }
		 else if(start[i]>start[j] || end[i]<end[j])
		{
		    System.out.println("Range");
			System.out.println(start[i]+"-"+end[j]);
		}
		
	    }
	}
	}
	else
	{
		return;
	}
	i++;
	
	}
}
}