package Headless;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChrome {
 // Just note
	WebDriver driver = null;


	@BeforeTest
	public void startDriver(){

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		
		driver = new ChromeDriver(options);
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // -- Implicit wait
		


	}

	@Test
	public void googldeSearch() throws InterruptedException{

		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("Automation step by Step");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		//Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}
	@AfterTest	
	public void closeDriver(){
		driver.close();
		System.out.println("Test done!!");
	}


}
