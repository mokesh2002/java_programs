import java.util.*;
 class parent
{
 public void parent1()
 {
    System.out.println("This is parent class");
 }
}
 class child extends parent
 {
    public void child1()
    {
        System.out.println("This is child class");
    } 
 }

public class parentchild
{
    public static void main(String args[])
    {
        parent sc=new parent();
        sc.parent1();
        child sv=new child();
        sv.child1();
        sv.parent1();
    }
}