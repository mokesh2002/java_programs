import java.util.*;
class factorialexample
{
public static void main(String[] args) 
{

        Scanner sv=new Scanner(System.in);
        System.out.print("Enter the number: ");
         int n=sv.nextInt();
        int fact=1;
        for (int i = 1; i <= n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " +n+"="+ fact);
    }
}