package com.test.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.test.genrics.BaseTest;
import com.test.genrics.ReadProperties;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHomePage extends BaseTest
{
	@Test
	public  void testHomePage() throws InterruptedException
	{   
		
		test = extent.createTest("TestHomePage");
		HomePage hp  = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		ReadProperties   rp   = new ReadProperties();
		lp.clickOnCityName(driver);
		lp.clickOnloginButton(driver);
		lp.clickOnsignInButton(driver);
		lp.enterUserNameTxtBx(driver, rp.getUsername());
		lp.enterPasswordNameTxtBx(driver, rp.getPassword());
		lp.clickOnSignButton(driver);
	   hp.clickONAcServices(driver);
       hp.clickOninstallationBtn(driver);
		
		
		

	}
}