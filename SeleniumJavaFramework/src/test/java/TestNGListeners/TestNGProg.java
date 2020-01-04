package TestNGListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class TestNGProg {
	

	WebDriver driver = null;
	
	@BeforeTest
	public void startDriver(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@Test(priority = 3)
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

	
	@Test
	public void test1(){
		
		System.out.println("I am inside Test1");
	}
	
	@Test
	public void test2(){
		
		System.out.println("I am inside Test2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3(){
		
		System.out.println("I am inside Test3");
	}

	@Test
	public void test4() throws Exception{
		
		System.out.println("I am inside Test4");
		throw new Exception("Just an exception thoriwng to test");
	}

	@Test
	public void test5(){
		
		System.out.println("I am inside Test5");
	}


}
