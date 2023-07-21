import java.util.*;
class multiple
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   String a=sc.nextLine();
   String m=sc.nextLine();
   String n=sc.nextLine();
   String g[]=a.split(" ");
    String[] b=a.split(" ");
	System.out.println("enter the position to underline");
   int c=sc.nextInt();
   String f[]=new String[10];
   f[0]=b[c];
   b[c]="_____";

	 for(int i=0;i<b.length;i++)
	 {
	 System.out.print(b[i]+" ");
	 }
	 System.out.println();
	 System.out.println(m);
	 System.out.println(n);
	 char v=sc.next().charAt(0);
	 int k=1;
	 String d[]=m.split(" ");
	  String l[]=n.split(" ");
	 if(m.charAt(k)== v)
	 {
		 b[c]=d[1];
	 }
	 else if(n.charAt(k)== v)
	 {
		 b[c]=l[1];
	 }
	 for(int i=0;i<b.length;i++)
	 {
	 System.out.print(b[i]+" ");
	 }
	 System.out.println();
	 if(f[0].equals(b[1]))
	 {
		 System.out.println("100%");
	 }
	 else 
	 {
		 System.out.println("50%");
	 }
	 for(int i=0;i<b.length;i++)
	 {
	   b[i]=.toUpperCase(b[i]);
	 System.out.print(b[i]+" ");
	 }
}
}
	 