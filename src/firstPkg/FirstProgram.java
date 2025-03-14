package firstPkg;

 public class FirstProgram
{
	//data types
	
	
	float b = 10.5f;  //global variable
	
	char c = 'X';
	String d = "Java";
	boolean e = true;
	
	String name="Java";

	
	
	
	 public void printval()
	{
		final int a = 10;  //local variable
		//a=20;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	 
	 public void variabledemo()
	 {
		 System.out.println(b);
		 System.out.println(name);
	 }
	
	public static void main(String[] args) 
	{
		FirstProgram abc = new FirstProgram();  //object of the class
		abc.printval();
		System.out.println(abc.name);
		
	}
	
}
