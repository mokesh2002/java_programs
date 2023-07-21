import java.util.*;
class slip
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
  int a[][]=new int[3][3];
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
      a[i][j]=sc.nextInt();
	  }
	  }
   for(int j=0;j<3;j++)
   {
    if(j%2!=0)
	{
		for(int i=2;i>=0;i--)
		{
	   System.out.print(" "+a[i][j]);
	 }
	}
	 else
	 {
		 for(int i=0;i<3;i++)
     {
	 System.out.print(" "+a[i][j]);
	 }
	 }
	 }
	 }
	 }
	  