package testNGDemo;

import org.testng.annotations.Test;

public class LoginScenario10
{

	@Test(groups="Sanity")
	public void first_testcase()
	{
		System.out.println("this is my first testcase");
	}
	
	
	@Test(groups="Smoke")
	public void second_testcase()
	{
		System.out.println("this is my second_testcase");
	}
	
	@Test(groups="Rel123")
	public void third_testcase()
	{
		System.out.println("this is my third testcase");
	}
	
	@Test(groups={"Smoke","Sanity"})
	public void forth_testcase()
	{
		System.out.println("this is my forth testcase");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is my fifth testcase");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is my sixth testcase");
	}
	
	
	
}
