package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	@FindBy(xpath=
			"//div[@id='react-view']/div/div/div[2]/div/section/div/div[2]/div/div/div/div/div/a/div")
	private WebElement acServices;

	@FindBy(xpath="//div[@id='react-view']/div/div/div[2]/div/div/main/section[1]/div[1]/div/div/section[3]/div/ul/li[4]")
	private WebElement installationBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public  void clickONAcServices(WebDriver driver)
	{
		WebDriverWait  wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(acServices));
		acServices.click();
	}
	public void clickOninstallationBtn(WebDriver driver)
	{
	   WebDriverWait wait  = new WebDriverWait(driver, 10);
	   wait.until(ExpectedConditions.elementToBeClickable(installationBtn));
	   installationBtn.click();
	}
}
