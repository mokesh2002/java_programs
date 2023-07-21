import java.util.*;
class arraysort
{
 public static void main(String args[])
{
   int i,j,temp;
   Scanner sc=new Scanner(System.in);
   System.out.print("enter a size of array");
   int size=sc.nextInt();
   int arr[]=new int[size];
   for(i=0;i<size;i++)
   {
      arr[i]=sc.nextInt();
   }
   for(i=0;i<size;i++)
   {
   for(j=i+1;j<size;j++)
   {
     if(arr[i]>arr[j])
	 {
	  temp = arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
	  }
	  }
	  }
	  System.out.print("{");
	  for(i=0;i<size;i++)
	  {
	    System.out.print(arr[i] +",");
	  }
	  System.out.print("}");
		}
} 