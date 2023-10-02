package basicProgramming;

public class PrimitiveDataType1 
{
 public void booleandatatype()
 {
	 boolean a = 200>100;
	 System.out.println(a);
	 
	 boolean b = 200>300;
	 System.out.println(b);
	 
	 boolean c = 100>20;
	 System.out.println(c);
	 
	 boolean d = 20<10;
	 System.out.println(d);
	 
	 boolean e = 60>20;
	 System.out.println(e);
 }
 public void bytedatatype()
 {
	 byte a = 10;
	 System.out.println(a);
	 
	 byte b = -128;
	 System.out.println(b);
	 
	 byte c = 127;
	 System.out.println(c);
	 
	 byte d = 100;
	 System.out.println(d);
	 
	 byte e = 125;
	 System.out.println(e);
 }
 public void shortdatatype()
 {
	 short a = 0;
	 System.out.println(a);
	 
	 short b = 1000;
	 System.out.println(b);
	 
	 short c = -32768;
	 System.out.println(c);
	 
	 short d = 32767;
	 System.out.println(d);
	 
	 short e = 32000;
	 System.out.println(e);
	 
 }
 public void intdatatype() 
 {
	 int a = 20000000;
	 System.out.println(a);
	 
	 int b = 2147483647;
	 System.out.println(b);
	 
	 int c = -2147483648;
	 System.out.println(c);
	 
	 int d = 10000000;
	 System.out.println(d);
	 
	 int e = 0;
	 System.out.println(e);
	 
	 
 }
 public static void main(String[]args)
 {
	 PrimitiveDataType1 xyz = new PrimitiveDataType1();
	 xyz.booleandatatype();
	 xyz.bytedatatype();
	 xyz.shortdatatype();
	 
 }
}
