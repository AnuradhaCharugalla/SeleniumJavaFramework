package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectPackage.GooglePageObjectswithByElements;
import io.github.bonigarcia.wdm.WebDriverManager;



public class GoogleTestwithPOMwithByelements {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	GooglePageObjectswithByElements google = new GooglePageObjectswithByElements(driver);
		
		driver.get("https://www.google.co.in/");
		google.textBox("Automation Step by Step");
		google.button();
		
		Thread.sleep(5000);
				
		driver.close();
		System.out.println("Test done!!");
	}

}
