package com.test.script;


import org.testng.annotations.Test;

import com.test.genrics.BaseTest;
import com.test.genrics.ReadProperties;
import com.test.pages.AddCartPage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.pages.SchedulePage;



public class TestSchedulePage extends BaseTest
{
	@Test
	public  void testSchedulePage() throws InterruptedException
	{
		
	    test =   extent.createTest("TestSchedulePage");
		LoginPage  lp = new LoginPage(driver);
		HomePage   hp =new HomePage(driver); 
		AddCartPage act   = new AddCartPage(driver); 
		SchedulePage  sc  = new SchedulePage(driver);
        ReadProperties rp = new ReadProperties();
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
		sc.clickOnDateBtn(driver);
		sc.clickONtimebtn(driver);
		sc.clickOncontinueBtn3(driver);
		sc.clickOncheakBox(driver);
		sc.clickOncontinueBtn4(driver);
		sc.clickONbookBtn(driver);
		







	}


}