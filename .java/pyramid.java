import java.util.*;
class pyramid
{
 public static void main(String args[])
{
 int i,j,s,n=5;
  for(i=0;i<n;i++)
   {
    for(j=n-i;j>i;j--)
{
System.out.print(" ");
}
for(j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println( );
}
}
}