import java.util.*;
class fibonaci
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int f1,f2,f3,i=1;
   f1=1;
   f2=1;
    f3=0;
   while(i<n-1)
  {
    f3=f1+f2;
    f1=f2;
    f2=f3;
i++;
}
System.out.println(f3);


}
}
