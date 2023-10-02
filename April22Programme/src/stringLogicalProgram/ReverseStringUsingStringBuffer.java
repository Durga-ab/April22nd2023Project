package stringLogicalProgram;

public class ReverseStringUsingStringBuffer 
{
	public static void main(String[]args)
	{
		String a="DURGA";
		
		StringBuffer s = new StringBuffer(a);
		System.out.println("Reverse String is: "+s.reverse());
	}

}
