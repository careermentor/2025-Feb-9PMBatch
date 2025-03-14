package oopsConcept;

public class T1_Login extends Login_Funct
{

	
	public void enter_password() 
	{
	
		System.out.println("this is T1 password");
		
	}
	
	public static void main(String[] args) 
	{
	
		T1_Login t1 = new T1_Login();
		t1.enter_username();
		t1.enter_password();
		
	}

}
