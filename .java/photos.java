import java.util.*;
class photos
{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("length");
     int l=sc.nextInt();
    System.out.println("photos:");
      int k=sc.nextInt();
  int w[]=new int[k];
   int h[]=new int[k];
   for(int i=0;i<k;i++)
{   
      
      w[i]=sc.nextInt();
       h[i]=sc.nextInt();
}
  for(int i=0;i<k;i++)
{   

    if(w[i]<l || h[i]<l)
     {
      System.out.println("UPLOAD ANOTHER");
     }
    else
     {
       if(w[i]==h[i])
        {
          System.out.println("ACCEPTED");
        }
       else
        {
          System.out.println("CROP IT");
         }
     }
}
}
}





