package logicalProgramsAshutosh;

public class FindMissingArray
{
	public static void main(String[] args) 
	{
		 int a[]= {1,2,3,5,6};
		 int sum1=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum1=sum1+a[i];
		 }
		 System.out.println("Sum of Element In array:"+sum1);
		 int sum2=0;
		 for(int i=1;i<=6;i++)
		 {
			 sum2=sum2+i;
		 }
		 System.out.println("Sum Of renge Of Element in array:"+sum2);
		 System.out.println("Missing Number In array:"+(sum2-sum1));
	}
	
		
		

}
