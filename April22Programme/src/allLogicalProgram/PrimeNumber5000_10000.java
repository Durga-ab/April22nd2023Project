package allLogicalProgram;

public class PrimeNumber5000_10000 
{
	//input First Number=5000
	//input Second number=10000
	//print prime number in between 5000_10000;
	
int a=5000;
int b=10000;
int i;
int j;

public void a1()
{ 
	System.out.println("Printed Prime Number in between5000_10000 ");
	for(i=a;i<=b;i++)         //i=5000
	{
		for(j=2;j<=i;j++)     //i=5000 j=5003
		{
			if(i%j==0)
			{
				break;	                      //5000%5003=5000  break;
			}
		    
		}
		if(i==j)             
		{
			System.out.println(j);
		}
			
	}
}
                 public static void main(String[]args)
            {
                	 PrimeNumber5000_10000 s = new PrimeNumber5000_10000();
                	 s.a1();
            }

}
