import java.util.*;
class perfects
{
      public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  for(int i=0;i<n;i++)
		  {
		    a[i]=sc.nextInt();
			}
		 int count=0,b=0;
		 int k=0;
		 for(int i=0;i<n;i++)
		 {
			 k=a[i];
			 count=1;
		 for(int j=i+1;j<n;j++)
		 {
			 k=k+a[j];
			 count++;
		   for(int v=1;v<=n;v++)
		   {
			if(k==v*v)
			{
			b=count;
			 break;
			}
		   }
			}
		 }
		System.out.println(b);
			
			}
			}
			
		      