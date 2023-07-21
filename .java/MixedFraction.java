import java.util.*;
class MixedFraction
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the  whole number :");
        int num=sc.nextInt();
        System.out.print("Enter the  numerator number  :");
        int num1=sc.nextInt();
        System.out.print("Enter the  denominator number :");
        int num2=sc.nextInt();
        if(num<=0 || num1<=0 || num2<=0 || num1>num2)
        {
            System.out.print("Invalid Inputs");
            return;
        }
        int result=(num*num2)+num1;
        System.out.println(result);
        System.out.println(num2);
    }
    
}

