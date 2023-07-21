import java.util.*;
class twodim
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
   System.out.println("enter rows:");
   int n=sc.nextInt();
   System.out.println("enter columns:");
   int m=sc.nextInt();
  int a[][]=new int[n][m];
   for(int i=0;i<n;i++)
   {
   for(int j=0;j<m;j++)
   {
     a[i][j]=sc.nextInt();
	 }
	 }
	 int k=0,l=1,o=2;
	  for(int i=0;i<n;i++)
   {
   for(int j=0;j<m;j++)
   
   {
      if(j==k)
	  {
	    System.out.print(a[i][l]+a[i][o]);
		}
	  else if(j==l)
	  {
	     System.out.print(a[i][l]-a[i][k]);
		 }
		 else
		 {
		   System.out.print(a[i][j]);
		   }
		   }
		   System.out.println();
		   }
		   }
		   }
	  