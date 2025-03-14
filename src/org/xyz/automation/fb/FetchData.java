package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchData 
{
	WebDriver driver;
	
	
	@Test
	public void loginpage() throws Exception
	{
		
		driver= new ChromeDriver();  //launch your ChromeBrowser
		
		String Exp_URL="https://www.facebook.com";
		
		driver.get(Exp_URL);
		
		String Act_URL = driver.getCurrentUrl();  //fetching URL
		System.out.println(Act_URL);
		
		
		//Assert.assertEquals(Act_URL, Exp_URL);  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Act_URL, Exp_URL);
		
		System.out.println("this is going to be failed");
		
		String Exp_PageTitle = "Facebook – log in or sign up";
		
		String Act_PageTitle =  driver.getTitle();
		System.out.println(Act_PageTitle);
		
		sa.assertEquals(Act_PageTitle, Exp_PageTitle);
		
		String Exp_username_textbox = "Email address or phone number";
		String Act_username_textbox = driver.findElement(By.id("email")).getAttribute("placeholder");
		
		sa.assertEquals(Act_username_textbox, Exp_username_textbox);
		
		String Exp_password_textbox = "Password";
		String Act_password_textbox = driver.findElement(By.id("pass")).getAttribute("placeholder");
		
		sa.assertEquals(Act_password_textbox, Exp_password_textbox);
		
		String Exp_login_button = "Log in";
		String Act_login_button = driver.findElement(By.name("login")).getText();
		
		sa.assertEquals(Act_login_button, Exp_login_button);
		
		System.out.println(driver.findElement(By.name("login")).getLocation());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.findElement(By.name("login")).isEnabled());
		
		sa.assertAll();
		
	}
	
		
}
