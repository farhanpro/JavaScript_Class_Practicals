public class Even_odd_array 
{
	public static void main(String args[])
	{
		int arr[]= { 2, 3, 6, 7, 10, 11, 8};
		int cnt_odd = 0;
		int cnt_even = 0;
		
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				cnt_even++;
			}
			else
			{
				cnt_odd++;
			}
		}
		System.out.println("Even numbers in array: "+cnt_even);
		System.out.println("Odd numbers in array: "+cnt_odd);
	}
}
