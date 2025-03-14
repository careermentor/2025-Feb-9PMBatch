package oopsConcept;

public class DemoChromeDriver implements DemoInterface
{

	
	public void cd() 
	{
	
		System.out.println("chrome driver");
		
	}

	
	public void sd() {
		System.out.println("safari driver");
		
	}

	
	public void ed() {
		System.out.println("edge driver");
		
	}
	
	public static void main(String[] args) {
		
		DemoChromeDriver dcd = new DemoChromeDriver();
		dcd.cd();
		
	}

}
