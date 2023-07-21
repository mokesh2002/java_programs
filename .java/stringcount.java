import java.util.*;
class stringcount
{
 public static void main(String args[])
{
  int sum=0;
  String str="52prep2aratio18";
  int size=str.length();
char arr[]=new char[size];
for(int i=0;i<size;i++)
{ 
  arr[i]=str.charAt(i);
 if(arr[i] >='0' && arr[i]<='9')
{
sum=sum+(arr[i]-'0');
}
}
System.out.println(sum);
}
}