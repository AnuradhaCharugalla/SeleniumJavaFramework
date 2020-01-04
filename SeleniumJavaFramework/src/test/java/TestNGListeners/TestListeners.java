package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("***************Comment onFinish  --- " + arg0.getName());;
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("***************Comment onStart  --- " + arg0.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("***************Comment onFailuredwith SuccessPecentage  --- " + arg0.getName());
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("***************Comment onFailure  --- " + arg0.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("***************Comment onTestSkipped  --- " + arg0.getName());
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("***************Comment onTestStart  --- " + arg0.getName());
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("***************Comment onTestSuccess  --- " + arg0.getName());
		
	}

}
