package TestNGListeners;

import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNGProg2 {
	
	@Test(priority = -4)
	public void test6(){
		
		System.out.println("I am inside Test6");
	}
	
	@Test(priority = 3)
	public void test7(){
		
		System.out.println("I am inside Test7");
		Assert.assertTrue(false);
	}
	
	@Test(priority = -1)
	public void test8(){
		
		System.out.println("I am inside Test8");
	}

	@Test(priority = 1)
	public void test9() throws Exception{
		
		System.out.println("I am inside Test9");
		throw new Exception("Just an exception thoriwng to test");
	}

	@Test(priority = 1)
	public void test10(){
		
		System.out.println("I am inside Test10");
	}
	
	@Test(priority = 0)
	public void test11(){
		
		System.out.println("I am inside Test11");
	}


}
