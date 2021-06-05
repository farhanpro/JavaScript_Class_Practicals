public class Square_array 
{
		public static void main(String args[])
		{
			int arr[]= {4, 6, 9, 11, 8};
			int sqr;
			
			System.out.println("Given Array : ");
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.println("Array after squaring elements: ");
			for(int i= 0; i<arr.length; i++)
			{
				sqr=arr[i]*arr[i];
				arr[i]=sqr;
				System.out.print(arr[i]+" ");
			}
		}
}






