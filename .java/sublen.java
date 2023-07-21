import java.util.*;
class sublen
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sa[]=s.split(" ");
        int n=sa.length;
        int k=sa[n-1].length();
        System.out.println(k);
    }
}