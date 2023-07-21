import java.util.*;
class patternright
{
 public static void main(String args[])
{
 int i,j,s,n=5;
  for(i=0;i<n;i++)
   {
   for(s=0;s<=i;s++)
   {
    System.out.print("* ");
   }
   for(j=0;j<n-i;j++)
   {
    System.out.print("  ");
   }
   System.out.println("\n");
}
}
}