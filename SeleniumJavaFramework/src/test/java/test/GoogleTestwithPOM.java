package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectPackage.GooglePageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestwithPOM {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		googldeSearch();
	}
	
	public static void googldeSearch() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		GooglePageObjects.textBox(driver).sendKeys("Automation step by Step");
		GooglePageObjects.button(driver).sendKeys(Keys.RETURN); // If search drop-down is not allowing the button click
		
		Thread.sleep(5000);
		
		driver.close();
		System.out.println("Test done!!");
	}

}
