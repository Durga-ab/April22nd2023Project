package mathematicsInJava;

public class BitwiseORLogical 
{
public static void main(String[]args)
{
	int a = 100;
	int b = 50;
	int c = 250;
	int d = 200;
	//Bitwise OR(|)
	System.out.println(a>b|b>c);//true|false=true
	System.out.println(c>d|b<a);//true|true=true
	System.out.println(a>c|d<a);//false|false=false
	System.out.println(c>a|b>c);//true|false=true
	
	int e = 300;
	int f = 250;
	int g = 100;
	int h = 50;
	//Logical OR(||)
	System.out.println(g<h||e>f);//false||true=true
	System.out.println(f>h||e<h);//true||false=true
	System.out.println(e>g||f>h);//true||true=true
	System.out.println(e<f||h>e);//false||false=false
}
}
