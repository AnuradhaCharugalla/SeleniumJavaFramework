package UploadFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingAutoIT {
	static WebDriver driver = null;
	
public static void main(String[] args) throws InterruptedException {
	test();
}


	public static void test() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","D:\\Test\\eclipse\\Webdrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // -- Implicit wait

		driver.get("http://tinyupload.com/index.php");
		String a = driver.findElement(By.xpath("//input[@name='uploaded_file']")).getTagName();
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).sendKeys("C:\\Users\\acharugalla\\Desktop\\AutoIT Scripts\\test1.txt");
		//driver.findElement(By.xpath("//b[contains(text(),'How it works?')]")).click();
		System.out.println("Clicked upload --- " + a);
		
		//Runtime.getRuntime().exec("C:/Users/acharugalla/Desktop/AutoIT Scripts/FileUpload.exe");
		
		Thread.sleep(5000);		
		
		driver.findElement(By.name("file_description")).sendKeys("This is description field");	
		driver.findElement(By.xpath("//img[@alt='Upload']")).click();
		Thread.sleep(10000);
		
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		   // System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Status')]")).getText());
		}

		//code to do something on new window

		driver.close();
		
		System.out.println("Test End");
		
		

	}



}
