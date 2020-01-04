package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchwithExpertReports {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		// Creating Expert Report Class
		
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html"); // This will create extent.html in project folder
            
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description_Searching Google page");
        ExtentTest test1 = extent.createTest("My Second Test", "Sample description_Searching Google page");

    	driver.get("https://www.google.co.in/");
        test.log(Status.INFO, "Opened https://www.google.co.in web page");
        
        driver.findElement(By.name("q")).sendKeys("Automation step by Step");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		test.pass(" Entered test and entered button");

		Thread.sleep(5000);
		test.info("Simple info message");
		     
        // log with snapshot
        test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test1.addScreenCaptureFromPath("screenshot.png");
        
        driver.close();
		System.out.println("Test done!!");
        // calling flush writes everything to the log file
		test.pass("Test Done");
        extent.flush(); // This command will send details to html page
		
	}

}
