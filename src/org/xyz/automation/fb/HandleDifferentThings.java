package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleDifferentThings 
{
	WebDriver driver;
	
	
	@Test(enabled=false)
	public void handleFrames() throws Exception
	{
		
		driver= new ChromeDriver();  //launch your ChromeBrowser
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		//CaptureScreenshot.results(driver);
		
	}
	
	@Test
	public void handleAlert() throws Exception
	{
		
		driver= new ChromeDriver();  //launch your ChromeBrowser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.results(driver, "handleAlert");
	
	}
	
	@Test(enabled=true)
	public void handleMouse() throws Exception
	{
		
		driver= new ChromeDriver();  //launch your ChromeBrowser
		driver.get("https://www.intellectdesign.com/");
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//ul[@class='menu-item intellect_main_menu']//a[text()='eMACH.ai']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//ul[@class='menu-item intellect_main_menu']//a[text()='eMACH.ai']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//ul[@class='menu-item intellect_main_menu']//a[text()='eMACH.ai']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Products ']"))).perform();
		//act.click(driver.findElement(By.xpath("//a[text()='Core Banking']"))).perform();
		
		CaptureScreenshot.results(driver,"handleMouse_1");
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Core Banking']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowsid = driver.getWindowHandles();
		Iterator<String> itr = windowsid.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		///driver.switchTo().window(win1);
		
		CaptureScreenshot.results(driver,"handleMouse_2");
		
	}
	
	
	@Test(enabled=false)
	public void handleKeyboard()
	{
		
		driver= new ChromeDriver();  //launch your ChromeBrowser
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass1234").perform();
		
		//act.sendKeys(Keys.ENTER).perform();
		
	}
	
	
	
}
