package controlStatement;

public class KiranStoreExecution 
{
	public static void main(String [] args)

	{
		KiranaStore v1 = new KiranaStore();
		v1.product();
		System.out.println("-----------------------------------------");
		System.out.println("Item 	Unit Rate	Qnt	Total");
		System.out.println("-----------------------------------------");
		v1.sugar("Sugar", 1);
		v1.tea("Tea", 7);
		v1.rice("Rice", 1);
		v1.soap("Soap", 5);
		v1.maggi("Maggi", 9);
		System.out.println("-----------------------------------------");
		v1.total();
		
	}

}
