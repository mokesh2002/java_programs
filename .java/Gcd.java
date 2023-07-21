import java.util.*;
class Gcdj
{
    public int gcd(int num,int num1)
    {
        if(num1==0)
        {
        return num;
        }
        else
        {
            return gcd(num1,num%num1);
        }
    }
}
class Gcd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("Enter the  another number: ");
        int num1=sc.nextInt();
        Gcdj sv=new Gcdj();
        System.out.print(sv.gcd(num,num1));
    }
}
