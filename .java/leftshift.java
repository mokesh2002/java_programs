import java.util.*;
class leftshift
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int arr[]=new int[n];
   int f,l,j;
   System.out.println("enter the array");
   for(int i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
   }
   for(int i=0;i<k;i++)
   {
	   f=arr[0];
   for( j=0;j<n-1;j++)
   {
     arr[j]=arr[j+1];
	}
   l=arr[j];
   }
   for(int i=0;i<n;i++)
   {
     System.out.println(arr[i]);
   }
   }
   }