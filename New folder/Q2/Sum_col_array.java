public class Sum_col_array {
	public static void main(String args[])
	{
		int arr[][]= { {1, 3, 4},
				  {4, 8, 9}, 
			 	  {2, 7, 9} };
		int col_sum;
		for(int i=0; i<3; i++)
		{
			col_sum=0;
			for(int j=0; j<3; j++)
			{
				col_sum += arr[j][i];
			}
	System.out.println("Sum of row "+(i+1)+" : "+col_sum);
}	}	}
