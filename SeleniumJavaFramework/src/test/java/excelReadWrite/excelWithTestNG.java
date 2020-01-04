package excelReadWrite;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excelWithTestNG {

	/*
	 * Using TestNg dataProvider, we can run test for each set of data (each row of Data) as below.
	 * We need to get data using a function. we have to use TestNG annotation "@DataProvider(name= "Any name.. but must be same in next step")"
	 * we have to use that data for any function to test. for this we need to use testNG annotation @Test(dataProvider = "Same name as mentioned in above step")
	 * This function should get arguments equal to no of columns to represent each set of data
	 */



	WebDriver driver = null;


	@BeforeTest
	public void startDriver(){

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}


	@Test(dataProvider = "test1data")
	public void linkedIn(String uName, String password, String Comment) throws InterruptedException{

		driver.get("https://www.linkedin.com/login");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		System.out.println(Comment);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
		Thread.sleep(3000);
	}


	@AfterTest	
	public void closeDriver(){
		driver.close();
		System.out.println("Test done!!");
	}

	@DataProvider(name="test1data")
	public Object[][] testData() throws IOException {
		String Path = "D:/Anuradha/Eclipse/WorkSpace/SeleniumJavaFramework/ExcelFiles/TestData.xlsx";
		String Sheet = "TestSheet";
		ExcelRead obj = new ExcelRead(Path, Sheet);
		int row = obj.getRowCount() -1;
		int col = obj.getColumnCount();
		Object data[][] = new Object [row][col];
		data = obj.getData(row, col);
		return data;
	}




}
