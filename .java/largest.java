import java.util.*;
class largest
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   if(a>b&&a>c){
      System.out.println("largest element"+a);
   }
   else if(b>a&&b>c)
   {
      System.out.println("largest element"+b);
   }
  else
  {
      System.out.println("largest element"+c);
}
}
}