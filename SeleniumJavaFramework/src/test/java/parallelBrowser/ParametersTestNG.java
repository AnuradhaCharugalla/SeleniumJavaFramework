package parallelBrowser;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestNG {
	
	@Test
	@Parameters({"MyName"})
	public void test1(@Optional("Default Name")String Name){
		System.out.println("My Name is -- " + Name);
		
	}

}
