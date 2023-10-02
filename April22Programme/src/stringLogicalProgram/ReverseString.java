package stringLogicalProgram;

public class ReverseString 
{
	public static void main(String[]args)
	{
		String a = "ashutosh";
		int length =a.length();
		
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		
		}
	}

}
