package arrayLogicalProgram;

import java.util.Arrays;

public class IntergerAscendingAndDecending 
{
	public void ascending()
	{
		int [] n = new int[10];
		n[0]=6;
		n[1]=4;
		n[2]=9;
		n[3]=10;
		n[4]=8;
		n[5]=7;
		n[6]=5;
		n[7]=1;
		n[8]=3;
		n[9]=2;

		
		Arrays.sort(n);
		System.out.println("Printing in Ascending order");
		for(int r =0; r<=n.length-1; r++)
		{
			System.out.println(n[r]);
		}
	}
		
		public void decending()
		{
			int [] n = new int[10];
			n[0]=6;
			n[1]=4;
			n[2]=9;
			n[3]=10;
			n[4]=8;
			n[5]=7;
			n[6]=5;
			n[7]=1;
			n[8]=3;
			n[9]=2;
			
			Arrays.sort(n);
			System.out.println("Printing in dscending order");
			for(int r=n.length-1;r>=0; r--)
			{
				System.out.println(n[r]);
			}
			
		}
		
		public static void main(String[]args)
		{
			IntergerAscendingAndDecending a= new IntergerAscendingAndDecending ();
			a.ascending();
			a.decending();
		}
		
	}


