package com.test.generics;



	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Basetest 
	{
		public static ExtentHtmlReporter reporter;
		public static ExtentReports extent;
		public static ExtentTest   test;
		public static WebDriver  driver;
	    public	static ReadProperties rp   = new ReadProperties();
		@BeforeSuite
		public void setUp()
		{
			   
		    reporter  = new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/ExtentReports.html");
			reporter.config().setDocumentTitle("TestAutomation");
			reporter.config().setReportName("logintest");
			reporter.config().setTheme(Theme.DARK);
		    extent = new ExtentReports();
			extent.attachReporter(reporter);
			WebDriverManager.chromedriver().setup();

			
			
		}
		@BeforeClass
		public void openBrowser()
		{
			driver   = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(rp.getUrl());
			
		}
		@AfterMethod
		public void Testreports(ITestResult result)
		{
			if(result.getStatus()==ITestResult.SUCCESS)
			{

				test.createNode(result.getName());
				test.log(Status.PASS,"the testcase "+result.getName()+"is passed");
			}


			else if(result.getStatus()==ITestResult.FAILURE)
			{
				test.createNode(result.getName());
				test.log(Status.FAIL,"the test case"+result.getName()+"is failed" );
				String s  = FwUtiles.captureScreenShot(driver);
				test.addScreenCaptureFromBase64String(s);
			}
			else if(result.getStatus()== ITestResult.SKIP)
			{
				test.createNode(result.getName());
				test.log(Status.FAIL,"the test case"+result.getName()+"skiped");
			}
		}

		@AfterSuite
		public void tearclose()
		{
			extent.flush();

		} 
	}



