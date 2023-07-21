import java.util.*;
class add{
    public static void main(String args[])
    {
     addition my=new addition();
    Scanner input=new Scanner(System.in);
       my.a=input.nextInt();
       my.b=input.nextInt();
       int c=my.b+my.a;
       System.out.println(c);
    }
}
class addition
{
    
  int a;
  int b;
  
}
