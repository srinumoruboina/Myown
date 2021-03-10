package com.test.scripts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.test.generics.Basetest;
import com.test.generics.FwUtiles;
import com.test.generics.ReadProperties;
import com.test.pages.DetailesPage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;

public class TestDetailesPage extends Basetest
{
	@Test
	
	public void testDetailesPage( )
	{
		test = extent.createTest("TestDetailesPage"); 
		ReadProperties rp = new ReadProperties();

		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		DetailesPage dp = new DetailesPage(driver);
		lp.usernameTXtBx(driver, rp.getUserName());
		lp.passwordTxtBx(driver, rp.getPassword());
		lp.lgnBtn(driver);
		int row = 0;
		int cell = 0;
		hp.clickOnSerchBx(driver,FwUtiles.read(row, cell));
		hp.clickONSerchBtn(driver);
		String  pwh = driver.getWindowHandle();
		hp.clickonjerkinBtn(driver);
		Set<String> set   = driver.getWindowHandles();
		System.out.println(set);
		for (String string : set)
		{
			if(!string.equals(pwh))
			{
				driver.switchTo().window(string);
				//dp.clickonSizeBx(driver);
				//dp.clickonByBtn(driver);
				//dp.continueBtn(driver);	
			    driver.switchTo().window(pwh);
			    dp.clickonjerkinBtn2(driver);
			   // driver.switchTo().window(pwh);
			    
			}
		}
	}
}
			  
			
			
	

