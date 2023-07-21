import java.util.*;
class bomb
{
public static void main(String args[])
{
int count=0;

    Scanner av= new Scanner (System.in);
 String a=av.nextLine();
      int size = a.length();
       char b='B';
       char w='W';
char arr[]=new char[size];
for(int i=0;i<size;i++)
{

 arr[i]=a.charAt(i);
if(b==arr[i] &&w==arr[i-1])
{
count=count+1;
arr[i-1]='-';
}
else if(b==arr[i] && w==arr[i-2])
{
count=count+1;
arr[i-2]='-';
}
else if(b==arr[i] && w==arr[i+2])
{
count=count+1;
arr[i+2]='-';
}
else if(b==arr[i] && w==arr[i+1])
{
count=count+1;
arr[i+1]='-';
}


}
System.out.print(count);

}
}

