import java.util.*;
class Fingers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input");
        int input=sc.nextInt();
        int result=0;
        if(input%8==0)
        {
            System.out.println("Index Finger");
        }
        else
        {
        result= input % 8;
        if(result>5)
        {
            result=10-result;
        }
        switch (result)
        {
            case 1:
            System.out.print("\nThumb Finger");
            break;
            case 2:
            System.out.print("\nThumb Finger");
            break;
            case 3:
            System.out.print("\nMiddle Finger");
            break;
            case 4:
            System.out.print("\nRing Finger");
            break;
            case 5:
            System.out.print("\nlittle Finger");
            break;
        }
        }
    
    }
}

        