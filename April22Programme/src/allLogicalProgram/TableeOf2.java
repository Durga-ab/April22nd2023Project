package allLogicalProgram;

public class TableeOf2 
{
 int i;
 public void a1()
 {
	 for(i=2;i<=10;i++)
	 {
		 System.out.println("2 * "+i+" = "+ 2*i);
	 }
 }
 public static void main(String[]args)
 {
	 TableeOf2 a = new TableeOf2();
	 a.a1();
 }
}
