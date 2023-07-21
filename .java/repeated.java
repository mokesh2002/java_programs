import java.util.*;
class repeated
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("array size:");
	int n=sc.nextInt();
  int a[]=new int[n];
    for(int i=0;i<n;i++)
	{
	 a[i]=sc.nextInt();
	 }
	 int count=0,k=0;
	 
for(int i=0;i<n;i++)
  {
   for(int j=i+1;j<n;j++)
   {
     if(a[i]==a[j])
	 {
	   a[k]=a[i];
	   }
	   }
	   }
	   k++;
	   System.out.println("Total Repeated elements:"+(k+1)
	  );
	   System.out.print("Repeated elements  are:");
	    for(int i=0;i<k+1;i++)
       { 
	        System.out.print(" "+a[i]);
			}
			}
			}
			]