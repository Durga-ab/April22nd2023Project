package practiceLogicalProgram;

public class StringPalindrome 
{
	public static void main(String[]args)
	{
		String a="durga";
		String reverse="";
		int length=a.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
		}
		if(a.equals(reverse))
		{
			System.out.println("This is palindrome String");
		}
		else
		{
			System.out.println("This is not palindrome String");
		}
	}

}
