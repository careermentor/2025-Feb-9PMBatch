package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginScenario3
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
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is my third testcase");
		Assert.assertEquals("Hello", "Hello world");
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
		Assert.assertEquals("Hello", "Hello world");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is my sixth testcase");
	}
	
	
	
}
