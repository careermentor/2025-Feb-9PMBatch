package org.xyz.automation.fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserControl 
{
	WebDriver driver;
	
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver= new ChromeDriver();  //launch your ChromeBrowser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		//driver.close();  //single window/tab
		driver.quit();  //will close multiple tab/window
		
	}
	
		
}
