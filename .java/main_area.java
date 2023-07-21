import java.util.*;
class area
{
    double l;
    double b;
    double h;
  area(double len,double bre,double hei)
  {
     l=len;
     b=bre;
     h=hei;
  }
  void rect()
  {
    System.out.println(l*h);
  }
  void tri()
  {
    System.out.println((b*h)/2);
  }
  void squa()
  {
    System.out.println(h*h);
  }
}
class main_area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        double len=sc.nextDouble();
        double hei=sc.nextDouble();
        double  bre=sc.nextDouble();
        area data1=new area(len,bre,hei);
        data1.tri();
        data1.squa();
        data1.rect(); 
    }
}