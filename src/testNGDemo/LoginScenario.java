package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginScenario
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("this is my first testcase");
		
		Assert.assertEquals("Hello", "Hello world");
	}
	
	
	@Test(priority=2,groups="Smoke")
	public void second_testcase()
	{
		System.out.println("this is my second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is my third testcase");
	}
	
	@Test(priority=0)
	public void forth_testcase()
	{
		System.out.println("this is my forth testcase");
	}
	
	@Test(priority=-1)
	public void fifth_testcase()
	{
		System.out.println("this is my fifth testcase");
	}
	
	@Test(priority=-2)
	public void sixth_testcase()
	{
		System.out.println("this is my sixth testcase");
	}
	
	
	
}
