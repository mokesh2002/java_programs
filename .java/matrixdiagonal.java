import java.util.*;
class matrixdiagonal
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 System.out.println("size of matrix");
	 int n=sc.nextInt();
	 int matrix[][]=new int[n][n];
	 int ld=0,rd=0;
	 System.out.print("Enter the matrix:"); 
	 for(int i=0;i<n;i++)
	 {
	 for(int j=0;j<n;j++)
	 {
	    matrix[i][j]=sc.nextInt();
		
	 }
	}
	for(int i=0;i<n;i++)
	{
	  ld=ld+matrix[i][i];
	  rd=rd+matrix[i][n-1-i];
	 }
	 System.out.println("sum of left diagonal:"+ld);
	 System.out.println("sum of right diagonal:"+rd);
	 }
	 }