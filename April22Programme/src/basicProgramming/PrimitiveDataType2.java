package basicProgramming;

public class PrimitiveDataType2 
{
 public void longdatatype() 
 {
	long a = 0l;                // l suffix
	System.out.println(a);
	
	long b = 0;                 //l suffix not mention
	System.out.println(b);
	
	long c = 2147483647;        // in between int range value not red.l suffix
	System.out.println(c);
	
	long d = 2147483648l;       //over theb int range value l suffix mandatory
	System.out.println(d);
	
	long e = 100;               //in between intdatatype value range not red.l suffix
	System.out.println(e);
 }
 public void floatdatatype()
 {
	 float a = 0.0f;     // decimal no in red. f suffix after the no.
	 System.out.println(a);
	 
	 float b = 2.34f;
	 System.out.println(b);
	 
	 float c = 2147483647; //if the int value range in bet so need f suffix after the no.
	 System.out.println(c);
	 
	 float d = 2147483648f; //if the intdatatype oer the value so f suffix is mandatory
	 System.out.println(d);
	 
	 float e = 100;   //int  range value in bet so f suffix not mandatory
	 System.out.println(e);
	 
 }
 public void doubledatatype()
 {
	 double a = 0.0d;  // decimal no in d suffix mandatory
	 System.out.println(a);
	 
	 double b = 2.34f;// in double data type float data is type allowed
	 System.out.println(b);
	 
	 double c = 20000l; //in double data type long data type is allowed
	 System.out.println(c);
	 
	 double d = 2147483647;//int range betn no. not red. d suffix after the no.
	 System.out.println(d);
	 
	 double e = 2147483648d; //int data type over the range value so d suffix is mandatory
	 System.out.println(e);
 }
 public void chardatatype()
 {
	 char a = 'a';
	 System.out.println(a);
	 
	 char b = '@';
	 System.out.println(b);
	 
	 char c = '2';
	 System.out.println(c);
	 
	 char d = '>';
	 System.out.println(d);
	 
	 char e = 'D';
	 System.out.println(e);
	 
 }
 
 public static void main(String []args)
 {
	 PrimitiveDataType2 abc = new PrimitiveDataType2();
	 abc.longdatatype();
	 abc.floatdatatype();
	 abc.doubledatatype();
	 abc.chardatatype();
 }
}
