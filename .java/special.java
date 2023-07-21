import java.util.*;
class special
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String code=sc.nextLine();
        int n=code.length();
        int count=0;
        for (int i = 0;i<n-1;i++)
        {
            if((code.charAt(i)>=65 && code.charAt(i)<=90) || (code.charAt(i)>=97 && code.charAt(i)<=122))
            {
                count++;
            }
        }
        System.out.println(n-count);
    }
}