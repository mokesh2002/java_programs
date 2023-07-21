import java.util.*;
class Palindrome
{
     public String palin(String arr)
     {
        int n=arr.length();
        int s=0,mid=(n-1)/2,last=n-1;
        while(s<=mid)
        {
            if(arr.charAt(s)==arr.charAt(last))
            {
                s++;
                last--;
            }
            else
            {
                return"not palindrome";
                
            }
        }
          return"palindrome";
     } 
}
class StrinPalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String arr=sc.nextLine();
        Palindrome sv=new Palindrome();
         String arr1=sv.palin(arr);
         System.out.println(arr1);
        
    }
}