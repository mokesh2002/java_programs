3import java.util.*;
class parking
{
public static void main(String args[])
{
   Scanner sc =new Scanner(System.in);
   int r=sc.nextInt();
   int c=sc.nextInt();
   int a[][]=new int[r][c];
   for(int i=0;i<r;i++)
   {
   for(int j=0;j<c;j++)
   {
      a[i][j]=sc.nextInt();
	  }
	}
	int v=0,f=0;
	for(int i=0;i<r;i++)
	{
	int count=0;
	 for(int j=0;j<c;j++)
	 {
	 if(a[i][j]==1)
	 {
	 count++;
	 }
	 }
	 if(v<count)
	 {
	   v=count;
	   f=i+1;
	   }
	   }
	   System.out.println(f);
}
}