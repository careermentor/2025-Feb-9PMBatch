package oopsConcept;

public class T2_Login extends Login_Funct
{

	
	public void enter_password()
	{
		
		System.out.println("this is T2 password");
	}
	
	public static void main(String[] args) 
	{
	
		T2_Login t2 = new T2_Login();
		t2.enter_username();
		t2.enter_password();
		
	}
	

}
