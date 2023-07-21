import java.util.*;
class bulb
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
   int v=1,c=0;
   for(int i=0;i<n-1;i++)
   {
     if(a[i]==v)
	 {
	   a[i+1]=v;
	   }
	 else if(a[i]==c)
	   {
	   a[i+1]=c;
	   }
	   }
	   int count=0,k=0;
	   for(int i=0;i<n;i++)
       {
        if(a[i]==c)
		{
			count++;
        } 
		else if(a[i]==v)
		{
			k++;
		}
	   }
	   if(k==n)
	   {
		   System.out.println(1);
	   }
	   else{
		   {
			 System.out.println(count);  
		   }
  }
}
}