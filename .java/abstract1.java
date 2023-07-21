import java.util.*;
abstract class shape
{
    int  l=10;
    int b=5;
    abstract void area();
}
class rectangle extends shape
{
     void area()
     {
        System.out.println(l*b);
     }
}
class triangle extends shape
{  
    void area()
    {
        System.out.println(0.5*l*b);
    }

}
class circle extends shape
{
    void area()
    {
        System.out.println(3.14*l*l);
    }
}
class abstract2
{
    public static void main(String args[])
    {
        shape sc=new circle();
        shape sv=new triangle();
        shape sa=new rectangle();
        sv.area();
        sc.area();
        sa.area();
    }
}