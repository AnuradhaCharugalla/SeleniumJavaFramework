package parallelBrowser;

import org.testng.annotations.Test;

public class TestNGDependancies {
	
	@Test(dependsOnMethods = {"test2", "test3"}, priority = 1)
	public void test1(){
		
		System.out.println("I am inside Test 1");
	}
	
	@Test(groups = {"Test123"},priority = 2)
	public void test2(){
		
		System.out.println("I am inside Test 2");
	}
	
	@Test(dependsOnGroups = {"Test123"},priority = -1)
	public void test3(){
		
		System.out.println("I am inside Test 3");
	}

}
