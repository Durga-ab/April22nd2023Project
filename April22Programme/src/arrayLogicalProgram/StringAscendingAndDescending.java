package arrayLogicalProgram;

import java.util.Arrays;

public class StringAscendingAndDescending 
{
	public void ascending()
	{
		String[] n= new String[5];
		n[0]="Durga";
		n[1]="Pooja";
		n[2]="Rachna";
		n[3]="Swapnali";
		n[4]="Nisha";
		
		Arrays.sort(n);
		System.out.println("Printing in Ascending order");
		for(int r=0;r<=n.length-1;r++)
		{
			System.out.println(n[r]+"");
		}
	}
		
		public void descending()
		{
			String[] n= new String[5];
			n[0]="Durga";
			n[1]="Pooja";
			n[2]="Rachna";
			n[3]="Swapnali";
			n[4]="Nisha";
			
			Arrays.sort(n);
			System.out.println("Printing in Dscending order");
			for(int r=n.length-1;r>=0;r--)
			{
				System.out.println(n[r]+"");
			}
		

	}
	
	public static void main(String[]args)
	{
		StringAscendingAndDescending a = new StringAscendingAndDescending();
		a.ascending();
		a.descending();
	}

}
