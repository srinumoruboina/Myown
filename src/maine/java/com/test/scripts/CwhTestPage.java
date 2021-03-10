package com.test.scripts;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.test.generics.Basetest;
import com.test.generics.FwUtiles;
import com.test.generics.ReadProperties;
import com.test.pages.DetailesPage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;

public class CwhTestPage extends Basetest
{
	public void cwhTestPage(int row,int cell)
	{
		test = extent.createTest("Cwh TestPage");
		ReadProperties rp = new ReadProperties();
		LoginPage lp = new LoginPage(driver);
		HomePage  hp  = new HomePage(driver);
		DetailesPage  dp  = new DetailesPage(driver);
		lp.usernameTXtBx(driver, rp.getUserName());
		lp.passwordTxtBx(driver, rp.getPassword());
		lp.lgnBtn(driver);
		hp.clickOnSerchBx(driver,	FwUtiles.read(row, cell));
		hp.clickONSerchBtn(driver);
		String  pwh = driver.getWindowHandle();
		System.out.println("pw reference:"+"pwh");
		driver.getTitle();
		hp.clickonjerkinBtn(driver);
		Set<String>  whs  = driver.getWindowHandles();
		System.out.println(whs);
		int count = whs.size();
		driver.getTitle();
		for (String w : whs) 
		{
			if(!w.equals(pwh))
			{
				//dp.clickonSizeBx(driver);
				//dp.clickonByBtn(driver);
				//dp.continueBtn(driver);	
				driver.switchTo().window(w);
				 String s  =  driver.getTitle();
				driver.switchTo().window(pwh);
				dp.clickonjerkinBtn2(driver);
				Set<String>whs2   =driver.getWindowHandles();
				System.out.println(whs2);
				int count2 = whs2.size();
				 System.out.println(count2);
				  driver.getTitle();
				  for(String w1:whs)
				  {
			         driver.switchTo().window(w1);
			         String s1 = driver.getTitle();
			         if(s1.contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
			         driver.close();
				}
				    
			}}

//		for (String w : whs) 
//		{
//			driver.switchTo().window(w);
//
//			if (pwh.equals(w))
//			{
//				String	 s =driver.getTitle();
//				System.out.println(s);
//			}
//			else
//			{
//				driver.close();
			//}

		//}
	
}  }








