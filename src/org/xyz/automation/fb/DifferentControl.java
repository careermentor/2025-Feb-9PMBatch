package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DifferentControl 
{
	WebDriver driver;
	
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		
		
		driver= new ChromeDriver();  //launch your ChromeBrowser
		driver.manage().window().maximize();
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement b = driver.findElement(By.name("fld_username"));
		
		b.sendKeys("John");
		
		driver.findElement(By.id("datepicker")).sendKeys("03/25/1981");
		driver.findElement(By.xpath("//a[text()='25']")).click();
		
		//driver.findElement(By.xpath("//input[@value='home']")).click();
		
		
		//driver.findElement(By.className("displayPopup")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[text()='X']")).click();
		
		//Select gender = new Select(driver.findElement(By.name("sex")));
	//	gender.selectByIndex(1); //Male
		//gender.selectByValue("2");// Female
		
		//gender.selectByVisibleText("Male");
		
		//gender.deselectByVisibleText("Male");
		
		//gender.deselectAll();
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		//Thread.sleep(5000);
		Select st = new Select(driver.findElement(By.name("state")));
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	//	wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
		
		st.selectByVisibleText("Florida");
		
		
		
	}
	
		
}
