package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginScenario7
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is my first testcase");
	}
	
	
	@Test(groups="Sanity")
	public void second_testcase()
	{
		System.out.println("this is my second_testcase");
		Assert.assertEquals("Hello", "Hello world");
	}
	
	@Test(groups={"Regression","Sanity"})
	public void third_testcase()
	{
		System.out.println("this is my third testcase");
	}
	
	@Test
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
		Assert.assertEquals("Hello", "Hello world");
	}
	
	
	
}
