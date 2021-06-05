import java.util.Scanner;
interface StringDemo
{
	void Check();
}

class StringCheck implements StringDemo 
{
	String str1, str2;
	StringCheck(String str1, String str2) 
	{
		this.str1 = str1; this.str2 = str2;
	}
	
	public void Check()
	{
		if (str1.equals (str2))
			System.out.print("Strings are equal");
		else
			System.out.print("Strings are not equal");
	}
}

public class String_check 
{
	public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in);
		String str1, str2;
		System.out.println("Enter first String:"); 
		str1 = scanner.nextLine();
		System.out.println("Enter second String:"); 
		str2 = scanner.nextLine();
		StringCheck s1 = new StringCheck(str1, str2);
		s1.Check();	
		scanner.close();
	}
}



























