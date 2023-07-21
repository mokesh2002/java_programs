import java.util.*;
class Dictionary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> dict=new ArrayList<String>();
        dict.add("Apple");
        dict.add("pie");
        dict.add("Pear");
        System.out.println("Enter the String");
        String input=sc.next();
        int result=0;
        for(int i=1;i<=input.length();i++)
        {
          String sv=input.substring(0, i);
          if(dict.contains(sv))
          { 
            for(int j=i+1;j<=input.length();j++)
            {
                String sr=input.substring(i,j);
                if(dict.contains(sr))
                {
                    result=1;
                }
            }
          }
        }
        if(result==1)
        {
            System.out.println("It is segmented");
        }
        else
        {
            System.out.println("It is not segemnted");
        }
    }
}