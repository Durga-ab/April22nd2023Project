package controlStatement;

public class SwitchStatement 
{
	int Budget = 5;
	String Vehicle="Mastro";
	public void a1()
	{
		System.out.println("..Welcome Sir/Mam..");
		switch	(Budget)
		{
		case 1:System.out.println("Activa-93000/-");break;
		case 2:System.out.println("Jupiter-95000/-");break;
		case 3:System.out.println("vaspa-98000/-");break;
		case 4:System.out.println("Dio-99000/-");break;
		case 5:System.out.println("Mastro-88000/-");break;
		case 6:System.out.println("HFDelux-105000/-");break;
		case 7:System.out.println("Shine-107000/-");
		case 8:System.out.println("pulser-115000/-");
		case 9:System.out.println("Bullet-200000/-");

		default:System.out.println("Budget ke Bahar Hain");
		}
	}
	public static void main(String[]args)
	{
		SwitchStatement s = new SwitchStatement();
		s.a1();
	}
}
