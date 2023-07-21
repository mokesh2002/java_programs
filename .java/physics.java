import java.util.*;
class physics
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the String");
    String str=sc.nextLine();
    int size=str.length();
	char arr[]=new char[size];
      int i,j;
	  for(i=0;i<size;i++)
	  {
	  for(j=0;j<size;j++)
	  {
	  arr[i]=str.charAt(i);
	  if(j==size/2)
	  {
	  System.out.print(arr[i]);
	  }
	  else
	  {
	  if(i==size/2)
	  {
	  System.out.print(str);
	  break;
	  }
	  else
	  {
	  System.out.print(" ");
	  }
	 }
	 }
	 System.out.println();
	 }
	 }
	 }
	 