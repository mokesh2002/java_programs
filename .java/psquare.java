import java.util.*;
class psquare
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
   int count=0;
   for(int i=0;i<n;i++)
   {
     a[i]=sc.nextInt();
	}
	 for(int i=0;i<n;i++)
	 {
	 for(int j=1;j>0;j++)
	 {
	 if(a[i]==(j*j))
	 {
	 count++;
	 }
	 }
	 }
	 System.out.println("count:"+count);
	 }
	 }
   