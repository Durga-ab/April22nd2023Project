package practiceLogicalProgram;

public class StringReverse 
{
	public static void main(String[]args)
	{
		String a ="durga";
		int length=a.length();
		
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
	}

}
