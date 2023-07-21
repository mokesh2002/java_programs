import java.util.*;
class min_multiply
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,3};
        int len=arr.length;
        int min[]=new int[len];
             min=Arrays.sort(arr);
        int min_num=min[0];
        int dim[][]=new int[len][len];
        for(int i=2;i<=len;i++)
        {
            
            dim[i-1][i-1]=(arr[i-1]*arr[i]);
        }
        int mul_sum=0;
        for(int i=1;i<len ;i++)
        {
            mul_sum=mul_sum+dim[i][i];
        }
        System.out.println(mul_sum);
    }
}