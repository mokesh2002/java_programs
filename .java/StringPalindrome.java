import java.util.*;
class Palindrome
{
     public void palin(String arr)
     {
        int n=arr.length();
        int s=0,mid=(n-1)/2,last=n-1,f=0;
        while(s<=mid)
        {
            if(arr[s]==arr[last])
            {
                s++;
                last--;
            }
            elemnts{
                f=1;
            }
        }
        return f;
     } 
}
class StringPalindrome
{
    public static void main(Strinng args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String arr=sc.nextLine();
        Palindrome sv=new Palindrome();
        int r=sv.palin(arr);
        if (r==1)
        {
            System.out.println("String is palindrome");
        }
    }
}