import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Anuradha\\Eclipse\\Webdrivers\\Chrome\\chromedriver.exe"); //-- Added this path in environment path
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		Thread.sleep(3000);
		
		java.util.List<WebElement> lis = driver.findElements(By.tagName("input"));
		
		driver.close();
		System.out.println("Program done");
		
	
		
	}

}
