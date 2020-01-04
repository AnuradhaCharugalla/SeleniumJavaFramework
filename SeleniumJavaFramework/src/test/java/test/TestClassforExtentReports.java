package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassforExtentReports {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		ExtentHtmlReporter obj = new ExtentHtmlReporter("testExtent.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(obj);
		
		ExtentTest etest = report.createTest("Testing Google Serach");	
		
		driver.get("https://www.google.co.in");
		etest.info("Chrome Driver Opened with 'https://www.google.co.in' page");
		
		driver.findElement(By.name("q")).sendKeys("Extent Reports using Selenium");
		etest.pass("Entered Search text field");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		etest.pass("Enetered Search button");
				
		driver.close();
		etest.pass("Closed driver");
		
		driver.quit();
		etest.pass("Quit Driver");
		
		System.out.println("Test Done!!!");
		etest.log(Status.INFO, "Added an info message via log");
		
		report.flush();
	
	}

}
