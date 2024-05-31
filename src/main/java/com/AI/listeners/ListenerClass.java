package com.AI.listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.AI.Reports.ExtentManager;
import com.AI.Reports.ExtentReport;
import com.AI.screenshots.Screenshot;

import driver.DriverManager;

public class ListenerClass  implements ITestListener , ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		
		System.out.println("test started");
		 ExtentReport.initReports();  
		
	}
	

	@Override
	public void onFinish(ISuite suite) {
		
		System.out.println("test execution completed");
		try {
			ExtentReport.flushReports();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName()); 
		
		ExtentManager.getExtentTest().assignAuthor("kranthi");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		
		
		ExtentManager.getExtentTest().pass( result.getMethod().getMethodName() );
		 WebDriver driver = DriverManager.getDriver();
		Screenshot s = new Screenshot(driver);
		s.takescreenshot();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentManager.getExtentTest().fail("The test is" + result.getMethod().getMethodName() + " is failed");
		 WebDriver driver = DriverManager.getDriver();
		Screenshot s = new Screenshot(driver);
		s.takescreenshot();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentManager.getExtentTest().skip(result.getMethod().getMethodName() + "is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
