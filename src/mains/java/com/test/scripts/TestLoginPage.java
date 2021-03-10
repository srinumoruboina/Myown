package com.test.scripts;


import org.testng.annotations.Test;

import com.test.generics.Basetest;
import com.test.generics.ReadProperties;
import com.test.pages.LoginPage;

public class TestLoginPage extends Basetest
{
	@Test
	public void testLogin()
	{
		test = extent.createTest("logintest");
	    ReadProperties   rp = new ReadProperties();
		LoginPage lp = new LoginPage(driver);
		lp.usernameTXtBx(driver,rp.getUserName());
		lp.passwordTxtBx(driver,rp.getPassword());
		lp.lgnBtn(driver);
	}
} 

