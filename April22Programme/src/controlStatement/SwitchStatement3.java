package controlStatement;

public class SwitchStatement3 
{
int budget = 10000;
int amount = 60000;
public void a1()
{ System.out.println("Welcome Sir Our Showroom");
	if(amount>=50000)
	{
		System.out.println("Available this Bike");
	}
	else
	{
		System.out.println("Not availabe this Model");
	}
	switch(budget)
	{
	case 1:System.out.println("Activa-93000/-");break;
	case 2:System.out.println("Jupiter-95000/-");break;
	case 3:System.out.println("vaspa-98000/-");break;
	case 4:System.out.println("Dio-99000/-");break;
	case 5:System.out.println("Mastro-88000/-");break;
	case 6:System.out.println("HFDelux-105000/-");break;
	case 7:System.out.println("Shine-107000/-");break;
	case 8:System.out.println("pulser-115000/-");break;
	case 9:System.out.println("Bullet-200000/-");break;

	default:System.out.println("Budget ke Bahar Hain");
	}
	
}
public static void main (String[]args)
{
	SwitchStatement3 s = new SwitchStatement3();
	s.a1();
			
}
}
