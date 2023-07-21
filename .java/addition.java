import java.util.*;
class addition
{
  int a;
  int b;
  int c=a+b;
}
class add{
    public static void main(String args[])
    {
        Scanner sc=new Scaanner(System.in);
               addition my=new addition();
       my.a=sc.nextInt();
       my.b=sc.nextInt();
       System.out.println(my.c);
    }
}