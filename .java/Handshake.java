import java.util.*;
class Handshake
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of peoples: ");
        int num=sc.nextInt();
        int temp=0;
        for(int i=num-1;i>0;i--)
        {
            temp=temp+i;
        }
        System.out.println(temp);
    }
}
