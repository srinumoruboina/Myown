package com.test.script;


import org.testng.annotations.Test;

import com.test.genrics.BaseTest;
import com.test.genrics.ReadProperties;
import com.test.pages.AddCartPage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;



public class TestAddCartPage extends BaseTest
{
	@Test
	public void testAddCartPage() throws InterruptedException
	{
	     test = extent.createTest("TestAddCartPage");	
		AddCartPage act   = new AddCartPage(driver);
		LoginPage lp=new LoginPage(driver);
		ReadProperties rp  = new ReadProperties();
		 HomePage  hp  = new HomePage(driver);
		lp.clickOnCityName(driver);
		lp.clickOnloginButton(driver);
		lp.clickOnsignInButton(driver);
		lp.enterUserNameTxtBx(driver, rp.getUsername());
		lp.enterPasswordNameTxtBx(driver, rp.getPassword());
		lp.clickOnSignButton(driver);
		hp.clickONAcServices(driver);
		hp.clickOninstallationBtn(driver);
		act.clickonaddcartBtn(driver);
		act.clickOnContinueBtn(driver);
		act.clickOnContinueBtn2(driver);
		
		
	}

}
