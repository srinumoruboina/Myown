package com.test.script;



import java.io.FileInputStream;

import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.test.genrics.BaseTest;
import com.test.genrics.ReadProperties;
import com.test.pages.AddCartPage;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import com.test.pages.SchedulePage;



public class TestLogin extends BaseTest
{
	@Test
//	@Test(dataProvider = "login")
//	@Test(priority =0)
	public void testLoginPage(  ) throws InterruptedException
	{
		System.out.println("TEST Login");
		test=extent.createTest("logintest");
		System.out.println("1");
		LoginPage   ln = new LoginPage(driver);
		ReadProperties rp=new ReadProperties();
		ln.clickOnCityName(driver);
		ln.clickOnloginButton(driver);
		ln.clickOnsignInButton(driver);
		ln.enterUserNameTxtBx(driver, rp.getUsername());
		ln.enterPasswordNameTxtBx(driver, rp.getPassword());
		ln.clickOnSignButton(driver);
//		ln.enterUserNameTxtBx(driver, username);
//		test.log(Status.INFO, "Username entered");
//		ln.enterPasswordNameTxtBx(driver,password);
//		test.log(Status.INFO, "password entered");
//		ln.clickOnSignButton(driver);

		//Assert.fail();
	}




	//@Test(dependsOnMethods="testLoginPage")
//	public  void testHomePage()
//	{

	//	System.out.println("TestHomePage");
	//	test= extent.createTest("Test HomePage");
	//	HomePage    hp    = new HomePage(driver);
	//	AddCartPage act   = new AddCartPage(driver);
	//	SchedulePage  sc  = new SchedulePage(driver);
	//	hp.clickONMensGroomingButton(driver);
	//	hp.clickOnhairCutButton(driver);
	//}

	//@Test(priority=2,dependsOnMethods="testHomePage")
	//public void testAddCartPage()
	//{
	//	AddCartPage         act   =  new AddCartPage(driver);
		//System.out.println("TestAddCartPage");
	//	test= extent.createTest("TestAddCartPage");
	//.clickonaddcartBtn(driver);
	//	act.clickOContinueBtn(driver);
	//}


//	@DataProvider(name="login")
//	public String[][] data()
//	{
//		String[][] test=null;
//
//		try
//		{
//			FileInputStream fis  =new  FileInputStream(System.getProperty("user.dir")+"/src/test/resources/data.xlsx");
//			XSSFWorkbook   wb= new XSSFWorkbook(fis);
//			XSSFSheet sheet  = wb.getSheet("sheet1");
//			XSSFRow  Row     = sheet.getRow(0);
//			int NoOfCell        = Row.getLastCellNum();
//			int NoOfRow      = sheet.getPhysicalNumberOfRows();
//
//			Cell cell;
//			test=new String[NoOfRow-1][NoOfCell];
//			for (int i = 1; i<NoOfRow; i++)
//			{
//				for (int j = 0; j< NoOfCell; j++)
//				{
//					Row=sheet.getRow(i);		
//					cell=Row.getCell(j);
//					test[i-1][j]=cell.getStringCellValue();
//				} 
//			}
//
//		}
//		catch (Exception e) {
//		}
//		return test;
}

//	}