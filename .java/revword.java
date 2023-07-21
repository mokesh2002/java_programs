import java.util.*;
class revword
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b[]=a.split(" ");
	int n=b.length;
	for(int i=n-1;i>=0;i--)
	{
	    System.out.print(b[i]+" ");
		}
		}
		}