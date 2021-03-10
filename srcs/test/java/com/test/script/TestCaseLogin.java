package com.test.script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.genrics.BaseTest;
import com.test.pages.LoginPage;

import freemarker.ext.jsp.TaglibFactory.ClearMetaInfTldSource;

public class TestCaseLogin extends BaseTest
{

	@Test(dataProvider="login")

	public void testLoginPage(String username, String password)
	{
		LoginPage lp = new LoginPage(driver);
		test = extent.createTest("LoginTest");
		lp.clickOnCityName(driver);
		lp.clickOnloginButton(driver);
		lp.clickOnsignInButton(driver);
		lp.enterUserNameTxtBx(driver, username);
		lp.enterPasswordNameTxtBx(driver, password);
		lp.clickOnSignButton(driver);

	}

	@DataProvider(name="login")
	public String[][]data( ) 
	{
		String[][]data= null;

		try
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/data.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet      sheet   = wb.getSheet("sheet1");
			XSSFRow         row    = sheet.getRow(0); 
			int NoOFCell       =row.getLastCellNum();
			int NoOfRow       =sheet.getPhysicalNumberOfRows();
			Cell cell;

			data=new String[NoOfRow-1][NoOFCell];
			for(int i = 1; i<NoOfRow; i++)
			{
				for(int j = 0; j<NoOFCell; j++)
				{
					row   = sheet.getRow(i);
					cell   =row.getCell(j);
					data[i-1] [j]  = cell.getStringCellValue();
				}
			}        
System.out.println(data);
		}
		catch(Exception e)
		{

		}
		return data;
	}   
	
}

