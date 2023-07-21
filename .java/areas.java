import java.util.*;
/*multi level inheritance*/
class circle
{
    Scanner sc=new Scanner(System.in);
    void display()
    {
        double r,area;
        double p; 
        p = 3.14;
        System.out.println("Radius");
        r=sc.nextFloat();
        area=p*(r*r);
        System.out.println("Circle :"+area);
    }
}
class rect extends circle
{
    Scanner sa=new Scanner(System.in);
    void display1()
    {
        int l,b,area1;
        System.out.print("length :");
        l=sa.nextInt();
        System.out.print("Breadth :");
        b=sa.nextInt();
        area1=l*b;
        System.out.println("Rectangle :"+area1);
    }
}
class square extends rect
{
Scanner sv=new Scanner(System.in);
void display2()
{
    int l1,area2;
    System.out.print("length :");
    l1=sv.nextInt();
    area2=l1*l1;
    System.out.println("Square :"+area2);
}

}
class areas{
    public static void main(String args[])
    {
        square my=new square();
        my.display();
        my.display1();
        my.display2();
    }
}
