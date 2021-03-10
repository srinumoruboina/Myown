package com.test.genrics;

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

public class BaseTest
{
	public ExtentHtmlReporter reporter;
	public ExtentReports extent;
	public WebDriver driver;
	public ExtentTest test;
	public  ReadProperties rp  = new ReadProperties();
	
	@BeforeSuite

	public void setUp()
	{
	    reporter  = new ExtentHtmlReporter(System.getProperty("user.admin")+"reports/ExtentReports.html");
		reporter.config().setDocumentTitle("Automationtest");
		reporter.config().setReportName("logintest");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	//	ReadProperties rp = new ReadProperties();
	}	
	@BeforeClass
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(rp.getUrl());
	}
	@AfterMethod
	public  void createTestResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.createNode(result.getName());
			test.log(Status.PASS,"the testcase"+result.getName()+"is passed");
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.createNode(result.getName());
			test.log(Status.FAIL,"the test case"+result.getName()+"is failed");
			String screenshot     = Utiles.captureScreenShot(driver);
			test.addScreenCaptureFromBase64String(screenshot); 
		}
		else if(result.getStatus()== ITestResult.SKIP)
		{
			test.createNode(result.getName());
			test.log(Status.SKIP,"the test case "+result.getName()+"is skiped");

		}		  

	}


	@ AfterSuite
	public void tearDown()
	{
		extent.flush();
	}





}


