package allLogicalProgram;

public class AvgNumber 
{
    // find average number..
	//total:a+b+c+d+e;
	//total/total no.   .....a+b+c+d+e/5=avg.number
	//input n1=10; n2=1023; n3=120022; n4=999; n5=0;

	
	int a= 10;
	int b= 1023;
	int c= 120022;
	int d= 999;
	int e= 0;
	
	public void a1()
	{
		int sum=a+b+c+d+e;
		System.out.println("Total Marks:" + sum);
		
		double avg= sum/5.0;
		System.out.println("Average marks:" +avg);
		
	}
	public static void main(String[]args)
	{
		AvgNumber s = new AvgNumber();
		s.a1();
	}
	
}
