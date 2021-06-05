public class pos_neg_array 
{
	public static void main(String args[])
	{
		int arr[]= { -2, 3, 6, -7, 10, 11, 8};
		int cnt_pos = 0;
		int cnt_neg = 0;
		
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i]>0)
			{
				cnt_pos++;
			}
			else
			{
				cnt_neg++;
			}
		}
		System.out.println("Positive numbers in array: "+cnt_pos);
		System.out.println("Negative numbers in array: "+cnt_neg);
	}
}







