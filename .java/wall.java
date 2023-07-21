import java.util.*;
class wall
{
 public static void main(String args[])
{
  Scanner sc=new scanner(System.in);
  int t=sc.nextInt();
  while(t>0)
  {
   int i,j;
   char arr[]=new char[]
   size=arr.length;
   for(i=0;i<size;i++)
   {
      arr[i]=sc.nextLine();
   } 
   for(i=0;i<size;i++)
  {
    for(j=i+1;j<size;j++)
  {
      if (arr[i]==arr[j]);
       {
          count=count+1;
       }
  }
}
if (count>n/2)
   {
     System.out.println(count);
}
}
}
}
