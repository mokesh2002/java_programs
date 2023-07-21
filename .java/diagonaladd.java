import java.util.*;
class diagonaladd
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 System.out.println("size of matrix");
	 int n=sc.nextInt();
	 int matrix[][]=new int[n][n];
	 int matrix1[][]=new int[n][n];
	 int ld=0,rd=0;
	 System.out.println("Enter the matrix:"); 
	 for(int i=0;i<n;i++)
	 {
	 for(int j=0;j<n;j++)
	 {
	    matrix[i][j]=sc.nextInt();
		
	 }
	 }
	 System.out.println("Enter the matrix1:");
	 for(int i=0;i<n;i++)
	 {
	 for(int j=0;j<n;j++)
	 {
	    matrix1[i][j]=sc.nextInt();
		
	 }
	 }
	 for(int i=0;i<n;i++)
	{
	  matrix[i][i]=matrix1[i][i]+matrix[i][i];
	  matrix[i][n-1-i]=matrix1[i][n-1-i]+matrix[i][n-1-i];
	 }
	 System.out.println("after diagonal adding");
	 for(int i=0;i<n;i++)
	 {
	 for(int j=0;j<n;j++)
	 {
	    System.out.print(matrix[i][j]);
	 }
	 System.out.println();
	 }
	 }
	 }
	 
	 