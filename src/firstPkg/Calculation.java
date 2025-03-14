package firstPkg;

public class Calculation 
{

	
	public Calculation()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
	
	}

	
	public Calculation(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		
	}
	
	public Calculation(int a, float b)
	{
		float c = a+b;
		System.out.println(c);
		
	}
	
	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	
	public void printString(String name)
	{
		System.out.println(name);
		
	}
	
	public int addition(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
//	20+30+40
	// x = 20+30
	//x+40
	
	
	public static void main(int age) 
	{
		age=40;
		System.out.println(age);
	}
	
	public static void main(String[] args) 
	{
		Calculation cal1 = new Calculation();
	
		Calculation cal2 = new Calculation(30,40);
		
		
		
		/*
		cal.sum();
				
		cal.addition(cal.sum(), 40);
		
		int x = cal.addition(20, 30);
		cal.addition(x, 40);
		
		cal.printString("Java");
		*/
		
	}
	
}
