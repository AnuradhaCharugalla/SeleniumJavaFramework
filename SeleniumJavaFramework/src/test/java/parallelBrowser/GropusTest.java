package parallelBrowser;

import org.testng.annotations.Test;

@Test(groups = {"classGroup"})
public class GropusTest {
	@Test(groups = {"Sanity", "Smoke","Regression"}, priority = 10)
	public void test1(){
		System.out.println("This is test 1 with priotity 10 -- contains gropus -- Smoke, Sanity, Regression");
	}
	@Test(groups = {"Sanity", "Smoke","Regression"}, priority = -100)
	public void test2(){
		System.out.println("This is test 2 with priotity -100 -- contains gropus -- Smoke, Sanity, Regression");
	}
	@Test(groups = {"Sanity"}, priority = -2)
	public void test3(){
		System.out.println("This is test 3 with priotity -2 -- contains gropus -- Sanity");
	}
	@Test(groups = {"Smoke","Regression"}, priority = 1)
	public void test10(){
		System.out.println("This is test 10 with priotity 1 -- contains gropus -- Smoke, Regression");
	}
	@Test(groups = {"Smoke"}, priority = -201)
	public void test5(){
		System.out.println("This is test 5 with priotity -201 -- contains gropus -- Smoke");
	}
	@Test(groups = {"Regression"}, priority = 1)
	public void test100(){
		System.out.println("This is test 6 with priotity 1 -- contains gropus -- Regression");
	}
	@Test(groups = {"Sanity", "Smoke","Regression"}, priority = 1)
	public void test7(){
		System.out.println("This is test 7 with priotity 1 -- contains gropus -- Smoke, Sanity, Regression");
	}
	@Test(groups = {"Sanity", "Regression"}, priority = 1)
	public void test8(){
		System.out.println("This is test 8 -- contains gropus -- Sanity, Regression");
	}

}
