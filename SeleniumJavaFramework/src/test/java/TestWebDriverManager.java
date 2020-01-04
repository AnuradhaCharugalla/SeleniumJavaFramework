
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * This program is not executed normally. needed to add some more dependancies
 */

public class TestWebDriverManager {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("Program Done");
		
		
	}

}
