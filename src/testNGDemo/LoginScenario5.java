package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginScenario5
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is my first testcase");
	}
	
	
	@Test
	public void second_testcase()
	{
		System.out.println("this is my second_testcase");
	}
	
	@Test(groups="Smoke")
	public void third_testcase()
	{
		System.out.println("this is my third testcase");
	}
	
	@Test(groups="Regression")
	public void forth_testcase()
	{
		System.out.println("this is my forth testcase");
	}
	
	@Test(groups="Sanity")
	public void fifth_testcase()
	{
		System.out.println("this is my fifth testcase");
	}
	
	@Test(groups="Regression")
	public void sixth_testcase()
	{
		System.out.println("this is my sixth testcase");
		Assert.assertEquals("Hello", "Hello world");
	}
	
	
	
}
