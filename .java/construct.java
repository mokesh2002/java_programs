import java.util.*;
class constructor
{
    int roll_no;
    String name;
    int age;
constructor(int r,String nm,int a)
{
    roll_no=r;
    name= nm;
    age = a;
}
void display()
{
    System.out.println(roll_no+" "+name+" "+age);
}
}
class construct{
    public static void main(String args[])
    {
        constructor b1=new constructor(111,"jaya",18);
        b1.display();
    }
}