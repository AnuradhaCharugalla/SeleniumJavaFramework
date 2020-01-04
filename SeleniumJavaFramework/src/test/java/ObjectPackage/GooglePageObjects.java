package ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePageObjects {
	static WebElement element = null;
	
	
	public static WebElement textBox(WebDriver driver){
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	public static WebElement button(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		return element;
		
	}
	
	

}
