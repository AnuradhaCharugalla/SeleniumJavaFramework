package Waits;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitTest {

	WebDriver driver = null;

	@BeforeTest
	public void startDriver(){

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // -- Implicit wait


	}

	@Test
	public void googldeSearch() throws InterruptedException{

		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("Automation step by Step");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		Thread.sleep(5000);
		Instant start = Instant.now();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(40, TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS);
		
	
		wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Selenium Tutorial for Beginners: Learn WebDriver i')]"))).click();
		
		Instant finish = Instant.now();

		System.out.println( Duration.between(start, finish).toMillis());

	}
	@AfterTest	
	public void closeDriver(){
		driver.close();
		System.out.println("Test done!!");
	}


}
