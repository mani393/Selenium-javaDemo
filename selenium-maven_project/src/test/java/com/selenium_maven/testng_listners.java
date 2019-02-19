package com.selenium_maven;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class testng_listners implements ITestListener {
	
	

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("result"+result.getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("result"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("result"+result.getName());
		
	}

}
