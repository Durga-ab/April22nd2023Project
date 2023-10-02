package mathematicsInJava;

public class UnaryOperatorPostfix1 
{//(expression--)
	public static void main(String[]args)
	{
		int a = 10;
		System.out.println(a);//10
		System.out.println(a--);//10
		System.out.println(a);//9
		System.out.println(a--);//9
		System.out.println(a--);//8
		System.out.println(a);//7
	}

}
