import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindWebElementsTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		
		
		driver.get("https://www.google.co.in/");
		//Thread.sleep(3000);
		
		// finding elements with tag name input
		
		List<WebElement> lis = driver.findElements(By.tagName("input"));
		
		for(WebElement i:lis)
			System.out.println(i);
		
		
		driver.close();
		System.out.println("Program Done");
	}

}
