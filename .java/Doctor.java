import java.util.*;
class Doctor
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of patients :");
        int n=sc.nextInt();
        int fee=0;
        if(n==0 || n>20)
        {
            System.out.print("Invalid Inputs");
            return;
        }
         int arr[]=new int[n];
            System.out.println("Enter the age of patients");
             for(int i=0;i<n;i++)
             {
                arr[i]=sc.nextInt();
                if(arr[i]==0 || arr[i]>120 )
                {
                    System.out.println("Invalid Input");
                    return;
                }    
             }
             for(int i=0;i<n;i++)
             { 
                if(arr[i]<17)
                {
                    fee=fee+200;
                }
                else if(arr[i]>=17 && arr[i]<40)
                {
                    fee=fee+400;
                }
                else
                {
                     fee=fee+300;
                } 
             }
             System.out.println("Total Income "+fee+" INR");
             
                   
        
    }
    }
