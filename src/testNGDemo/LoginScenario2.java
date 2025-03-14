package testNGDemo;

import org.testng.annotations.Test;

public class LoginScenario2
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is my first testcase");
	}
	
	
	@Test(groups={"Regression","Sanity"})
	public void second_testcase()
	{
		System.out.println("this is my second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is my third testcase");
	}
	
	@Test(enabled=false)
	public void forth_testcase()
	{
		System.out.println("this is my forth testcase");
	}
	
	@Test(groups="Sanity")
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
