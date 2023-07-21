import java.util.*;
class Trail
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n =sc.nextInt();
        int count=0,result=1,i=1;
        while(i<=n)
        {
           result=result*i;
           i++;
        }
        while(result%10==0)
        {
            count++;
            result /=5;
        }
        System.out.println(count);
        
    }
}