import java.util.*;
class arrml
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int a[]=new int[n];
	   int b[]=new int[n];
	   int c[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
	     a[i]=sc.nextInt();
		
		 }
		 for(int j=0;j<n;j++)
	   {
	     
		 b[j]=sc.nextInt();
		 }
		 int k=n/2,m=0;
		 for(int i=0;i<n;i++)
		 {
		   if(i<k)
		   {
		   for(int j=k-1;k>=0;j--)
		   {
		      c[m]=a[i]*b[j];
			  m++;
			}
			
			}
			
			else if(k==i)
			{
			 c[m]=a[i]*b[i];
			 m++;
			 }
			 
			 else
			 {
			 for(int j=n-1;j>k;j--)
			 {
			   c[m]=a[i]*b[j];
			   m++;
			   }
			   }
			   }
			   for(int i=0;i<m;i++)
			   {
			   System.out.println(" ",c[i]);
			   }
			   }
			   }
		   
