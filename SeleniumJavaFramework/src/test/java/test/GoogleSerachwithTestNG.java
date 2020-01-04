 package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSerachwithTestNG {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void startDriver(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@Test
	public void googldeSearch() throws InterruptedException{
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by Step");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		Thread.sleep(5000);
	}
	@AfterTest	
	public void closeDriver(){
		driver.close();
		System.out.println("Test done!!");
	}

}
