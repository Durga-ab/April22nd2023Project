package controlStatement;

public class Switchstatement1 
{ //Hotel Menu
	int day = 4;
	public void a1()
	{
	switch (day)
	{
	case 1:System.out.println("Samosa");
	case 2:System.out.println("Dosa");
	case 3:System.out.println("panipuri");
	case 4:System.out.println("Kachori");break;
	case 5:System.out.println("Jilebi");
	case 6:System.out.println("Dhokla");
	case 7:System.out.println("Pav-vada");
	
	default : System.out.println("This Item not Available");
	}
	}

	public static void main(String[]args)
	{
		Switchstatement1 s = new Switchstatement1();
		s.a1();
	}
}

