package com.test.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCartPage 
{

	@FindBy(xpath="//div[@id='react-view']/div/div/div[2]/div/div/div[3]/main/section[2]/div[1]/div[1]/div[1]/div/div[1]/div")
	WebElement addcartBtn;

	@FindBy(id="continueButton")	
	WebElement continueBtn;
	
	@FindBy(xpath="//div[@id='react-view']/div/div/div[2]/div/section/div/div/div[1]/ul/li[1]/div[2]/div[3]/div/div/div[2]")
    WebElement continueBtn2;

	public AddCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void clickonaddcartBtn(WebDriver driver )
	{
		WebDriverWait wait   = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(addcartBtn));
		addcartBtn.click();
	}
	public void clickOnContinueBtn(WebDriver driver)
	{
		   WebDriverWait  wait  = new WebDriverWait(driver,10);
		   wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
		   continueBtn.click();
	}
	public void clickOnContinueBtn2(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		 WebDriverWait wait = new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.elementToBeClickable(continueBtn2));
		  continueBtn2.click();
	}
	
}





