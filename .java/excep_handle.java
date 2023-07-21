import java.util.*;
class excep_handle
{
    public static void main(String []args)
    {
        int a=10,b=0;
        int c=0;
        try {
             c=a/b;
        } catch (Exception e)
        {
            System.out.println("error occured");
        }
        System.out.println(c);
        System.out.println("end of program");
    }
}