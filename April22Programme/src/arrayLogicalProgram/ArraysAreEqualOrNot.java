package arrayLogicalProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysAreEqualOrNot 
{
	public static void main(String[]args)
	{
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
	    boolean status =true;
	    if(a1.length==a2.length);
	    {
	    	//compare rest of elements
	    	for(int i=0;i<a1.length;i++)
	    	{
	    		if(a1[i]!=a2[i])
	    		{
	    			status=false;
	    		}
	    	}
	    	
	    }
	   
		
	}

}
