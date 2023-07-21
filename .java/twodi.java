import java.util.*;
class twodi
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
   for(int i=0;i<n;i++)
   {
   for(int j=0;j<m;j++)
   {
    if(a[i][j]%5==0)
	{
	  System.out.print(" "+a[i][j] );
	 }
	 else if((i+j)%2==0)
	 {
	  System.out.print(" "+a[i][j]+5 );
     }
     else
	{
     
	System.out.print(" *" );
     }
   }
   System.out.println();
} 
  
}
}
     