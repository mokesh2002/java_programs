import java.util.*;
 class min2darray 
 {
    public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
	 System.out.println("size of matrix");
	 int n=sc.nextInt();
	 if(n==0)
			{
			System.out.println("There is no element in the array");
			}
	 else
	{
	 int arr[][]=new int[n][n];
	 for(int i=0;i<n;i++)
	 {
	 for(int j=0;j<n;j++)
	 {
	    arr[i][j]=sc.nextInt();
		
	 }
	 }
        int min = arr[0][0];
        for (int i = 0; i < n; i++)
		{
            for (int j = 0; j < arr.length; j++) 
			{
                if (arr[i][j] < min)
				{
                    min = arr[i][j];
                }
            }
		}
        System.out.println("Minimum value in 2d array = " + min);
	}
    }
}