package com.test.scripts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import com.test.generics.Basetest;
import com.test.generics.FwUtiles;
import com.test.generics.ReadProperties;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;

public class TestHomePage extends Basetest
{
    @Test
	public void testHomePage( )
     {
	    test = extent.createTest("Test Homepage");
    	ReadProperties rp = new ReadProperties();
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		  lp.usernameTXtBx(driver, rp.getUserName());
		  lp.passwordTxtBx(driver, rp.getPassword());
		  lp.lgnBtn(driver);
		  int row = 0;
		  int cell = 0;
		  hp.clickOnSerchBx(driver,FwUtiles.read(row, cell));
		  hp.clickONSerchBtn(driver);
		  hp.clickonjerkinBtn(driver);
		 
		  
     }
}
  

