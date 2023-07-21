import java.util.*;
class Floors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n=sc.nextInt();
        int steps=0;
        while(n>0)
        {
            if(n%2==0)
            {
                n=n/2;
                steps++;
            }
            else
            {
                n--;
                steps++;
            }

        }
        System.out.println(steps);
    }
}