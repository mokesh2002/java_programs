import java.util.*;
class employee
{
    int salary,hours;
    
    void getInfo(int s,int h)
    {
        salary=s;
        hours=h;
    }
    void AddSal()
    {
        if(salary<500)
        {
          salary=salary+10;
        }

    }
    void AddWork()
    {
       if(hours>6)
       {
        salary=salary+5;
       }
    }
    public double finalSalary() {
        return salary;
    }

} 
class employeemain
{
    public static void main(String args[])
    {
        employee v=new employee();
        v.getInfo(600,7);
        v.AddSal();
        v.AddWork();
        System.out.println(v.finalSalary());
    
    }
}