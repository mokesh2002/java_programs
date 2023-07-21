import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :");
        String var=sc.nextLine();
        System.out.print("Enter the Character :");
        char sv=sc.next().charAt(0);
        int count = 0;
        int n=var.length();
        for(int i=0;i<n;i++)
        {
            if(var.charAt(i)==sv)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}