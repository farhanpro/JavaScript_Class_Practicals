public class Sum_row_array 
{
	public static void main(String args[])
	{
		int arr[][]= { 
		         {1, 5, 4},
			     {4, 3, 9}, 
			     {2, 7, 6} 
				 };
		int row_sum;
		for(int i=0; i<3; i++)
		{
			row_sum=0;
			for(int j=0; j<3; j++)
			{
				row_sum += arr[i][j];
			}
			System.out.println("Sum of row "+(i+1)+" : "+row_sum);
		}
	}
}
