import java.util.*;
public class maximum 
{
   public static void main(String args[])
 {
      Scanner sv=new Scanner(System.in);
      int a=sv.nextInt();
      int b=sv.nextInt();
      int c=sv.nextInt();

      if (a >= b && a >= c)
         System.out.println(" the maximum number"+a);
      else if (b >= a && b >= c)
         System.out.println(" the maximum number"+b);
      else
         System.out.println(" the maximum number"+c);
   }
}