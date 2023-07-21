import java.util.Scanner;
 class twonumbersequal 
{
    public static void main(String[] args) 
    {
        int n1,n2;
        Scanner sv = new Scanner(System.in);
        System.out.print("Enter the first number:");
        n1= sv.nextInt();
        System.out.print("Enter the second number:");
        n2= sv.nextInt();
        if(n1== n2)
        {
            System.out.println("n1 and n2 are equal");
        }
        else
        {
            System.out.println("n1 and n2 are not equal");
        }
    }
}