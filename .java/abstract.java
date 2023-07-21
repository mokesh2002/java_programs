import java.util.*;
abstract class bike
{
    abstract void run();
}
class Honda extends bike
{
    void run()
    {
        System.out.println("running safely");
    }
}
class abstract1
{
    public static void main(String args[])
    {
        bike obj =new Honda();
        obj.run();
    }
}