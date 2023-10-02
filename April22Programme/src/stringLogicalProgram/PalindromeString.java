package stringLogicalProgram;

public class PalindromeString 
{
	public static void main(String[]args)
	{
		String a="MADAM";
		//String length=1 2 3 4 5 6 7 8
		String reverse = "";
		int Length = a.length();
		
		
		for(int i=Length-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
			                             //System.out.println(a.charAt(i));
		}
		if(a.equals(reverse))
		{
			System.out.println("This is Palindrome String");
		}
		else
		{
			System.out.println("This is not Palindrome String");
		}
	}

}
