package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test Case Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Execution Successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Execution Fail");
		TakeScreenShot.Takess(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
		
	}

}
