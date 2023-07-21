import java.util.*;
class mul{
     static void print()
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=a*b;
    int k=a+b;
    int j=a-b;
    int v=a/b;
    int s=a%b;
    System.out.println(c+" "+k+" "+j+" "+v+" "+s);
    }
}
class multiply
{
    public static void main(String args[])
    {
        mul mk=new mul();
        mk.print();
       
    }
}