import java.util.*;
class Member
{
    String name;
    int age;
    int phonenumber;
    String address;
    double salary;

    
    public void printSalary()
    {
        System.out.println("Salary :"+ salary);
    }
}
class Employee extends Member
{
   String specilization;
}
class Manager extends Member
{
    String department;

}
class Member1
{
    public static void main(String args[])
    {
      Employee emp=new Employee();
      emp.name="jaya kumar";
      emp.age=18;
      emp.salary=12500;
      emp.phonenumber=637952291;
      emp.address="Kumar nagar";
      Manager mng=new Manager();
      mng.name="selvi";
      mng.age=30;
      mng.salary=30000;
      mng.address="pollachi";
      mng.phonenumber=998765532;
      System.out.println("Employee Details");
      System.out.println("employee name"+emp.name);
      System.out.println("Age :"+emp.age);
      System.out.println("phonenumber"+emp.phonenumber);
      System.out.println("Address"+emp.address);
      System.out.println("salary"+emp.salary);
      System.out.println();
      System.out.println("Manager Details");
      System.out.println("Manager name"+mng.name);
      System.out.println("Age :"+mng.age);
      System.out.println("phonenumber"+mng.phonenumber);
      System.out.println("Address"+mng.address);
      System.out.println("salary"+mng.salary);


     

    }
}