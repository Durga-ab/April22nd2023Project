package mathematicsInJava;

public class BitwiseANDLogical 
{
public static void main(String[]args)
{
	int a= 200;
	int b = 250;
	int c = 100;
	int d=300;
	//Bitwise AND(&)
	System.out.println(a>b&b>c);//false&true=false
	System.out.println(b>c&a<d);//true&true==true
	System.out.println(d<a&c>b);//true&false=false
	System.out.println(a>b&b<c);//false&false=false
	
	int e = 230;
	int f = 450;
	int g = 200;
	int h = 100;
	//Logical AND (&&)
	System.out.println(g>e&&f>g);//false&&true=false
	System.out.println(f>g&&f>h);//true&&True=true
	System.out.println(e>h&&e>f);//true&&false=false
	System.out.println(f>e&&e>g);//true&&true=true
}
}
