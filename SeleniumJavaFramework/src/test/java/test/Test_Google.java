package test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Google {
	static Logger log = LogManager.getLogger(Test_Google.class);
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Testing \n");
		
		log.info("Info Message");
		log.error("Error message");
		log.fatal("Fatal Message");
		log.warn("Warning Message");
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by Step");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		Thread.sleep(5000);
		
		driver.close();
		System.out.println("Test done!!");
	}

}
