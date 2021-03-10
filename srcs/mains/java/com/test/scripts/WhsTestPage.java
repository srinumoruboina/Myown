package com.test.scripts;

import java.util.Set;

import org.testng.annotations.Test;

import com.test.generics.Basetest;
import com.test.generics.FwUtiles;
import com.test.generics.ReadProperties;
import com.test.pages.DetailesPage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;

public class WhsTestPage extends Basetest
{
	

	@Test
    public void whsTestPage()
    {
		test = extent.createTest("Test WhsPage");
    	ReadProperties rp = new ReadProperties();
    	LoginPage lp = new LoginPage(driver);
    	HomePage  hp  = new HomePage(driver);
       // WhsTestPage wtp = new 	WhsTestPage();	
    	DetailesPage  dp  = new DetailesPage(driver);
    	lp.usernameTXtBx(driver, rp.getUserName());
		lp.passwordTxtBx(driver, rp.getPassword());
		lp.lgnBtn(driver);
		int row = 0;
		int cell = 0;
		hp.clickOnSerchBx(driver,	FwUtiles.read(row, cell));
		hp.clickONSerchBtn(driver);
		String  pwh = driver.getWindowHandle();
		System.out.println("pw reference:"+pwh);
	    System.out.println(driver.getTitle());
		hp.clickonjerkinBtn(driver);
		Set<String> whs  = driver.getWindowHandles();
		System.out.println(whs);
		      int  count  =  whs.size();
		      System.out.println(count);
		for (String string : whs)
		{
			if(!string.equals(pwh))
			{
				driver.switchTo().window(string);
				//dp.clickonSizeBx(driver);
				//dp.clickonByBtn(driver);
				//dp.continueBtn(driver);	
			    driver.switchTo().window(pwh);
			    dp.clickonjerkinBtn2(driver);
			    Set<String>    whs2  = driver.getWindowHandles();
			        System.out.println(whs2);
			        int     count2 = whs2.size();
			        System.out.println(count2);
			    driver.switchTo().window(pwh);
			   String  s=  driver.getTitle();
			 
			}   
			} 
}}
