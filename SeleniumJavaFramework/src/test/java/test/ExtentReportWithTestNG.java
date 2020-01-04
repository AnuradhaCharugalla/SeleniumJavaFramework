package test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportWithTestNG {
	
	WebDriver driver = null;
	ExtentHtmlReporter obj;
	ExtentReports rep;
	ExtentTest test;
	
	Logger log = LogManager.getLogger("TestLogger");
	
	
	
	@BeforeTest
	public void startDriver(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		obj = new ExtentHtmlReporter("reportwithTestNG.html");
		rep = new ExtentReports();
		rep.attachReporter(obj);
		test = rep.createTest("Testing extent report with Test NG");	
	}

	@Test
	public void googldeSearch() throws InterruptedException{
				
		driver.get("https://www.google.co.in/");
		test.pass("Driver Opened");
		
		log.info("Info Message");
		log.error("Error message");
		log.fatal("Fatal Message");
		log.warn("Warning Message");
		
		
		driver.findElement(By.name("q")).sendKeys("Automation step by Step");
		test.pass("Sent Text data");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		test.pass("Sent button click");
		Thread.sleep(5000);
	}
	@AfterTest	
	public void closeDriver(){
		driver.close();
		test.pass("closed driver");
		System.out.println("Test done!!");
		rep.flush();
	}

}
