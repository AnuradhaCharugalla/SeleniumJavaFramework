package parallelBrowser;

import org.testng.annotations.Test;

public class TesNgIgnoreClass {
	
	@Test
	public void test1(){
		System.out.println("I m in test 1 ");
	}
	
	@Test(enabled = false)
	public void test2(){
		System.out.println("I m in test 2 ");
	}

}
