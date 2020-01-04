package ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePageObjectswithByElements {
	WebDriver driver = null;
	static WebElement element = null;
	 static By textBoxSearch = By.name("q");
	 static By buttonSearch = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
	 
	public GooglePageObjectswithByElements(WebDriver driver){
		this.driver = driver;
	}
	
	public void textBox(String text){
		driver.findElement(textBoxSearch).sendKeys(text);;		
	}
	
	public void  button(){
		driver.findElement(buttonSearch).sendKeys(Keys.RETURN);
				
	}
	
	

}
