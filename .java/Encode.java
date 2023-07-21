import java.util.*;
class Encode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String var=sc.nextLine();
        int n=var.length();
        int count=1,k=0;
        String arr[]=new String[n];
        int arr1[]=new int[n];
        String av="";
        for(int i=0;i<n-1;i++)
        {
            
           if(var.substring(i)==var.substring(i+1))
           {
                count++;
           }   
           else
           {
               arr[k]=""+var.charAt(i);
               arr1[k]=count;
               count=1;
               k++;
           }
        }
        for(int i=0;i<n;i++)
        {
        System.out.print(arr[i]);
        System.out.print(arr1[i]);
        }
        
       
    }
}