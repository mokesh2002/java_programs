import java.util.*;
class area
{
   int l=10;
   int b=4;
 }
   class rectangle
   {
   public static void main(String args[])
   {
	   
      area rect=new area();  
	  Scanner sc=new Scanner(System.in);
	  rect.l=sc.nextInt();
	  rect.b=sc.nextInt();
	  int a=(rect.l*rect.b);
       System.out.print(a);
	  }
	  }