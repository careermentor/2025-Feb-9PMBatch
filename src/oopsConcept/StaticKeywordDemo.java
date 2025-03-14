package oopsConcept;

public class StaticKeywordDemo 
{

	static int a = 20;
	
	public static void printVal()
	{
		
		System.out.println(a);
	}
	
	
	public void meth2()
	{
		System.out.println("this is not static method");
	}
	
	public static void main(String[] args) 
	{
	
		StaticKeywordDemo skd = new StaticKeywordDemo();
		
		printVal();
		
		skd.meth2();
		
	}
	
}
