package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.ExpectedExceptions;

public class SchedulePage 
{

	

	@FindBy(xpath="//div[@id='react-view']/div/div/div[2]/div/section/div/div/div/ul/li[2]/div[2]/div[2]/div/div/div[1]/div/div[3]")
	WebElement datebtn;

	@FindBy(xpath="//div[@id='react-view']/div/div/div[2]/div/section/div/div/div/ul/li[2]/div[2]/div[4]/section/div/div/div[2]/a[1]")
	WebElement timebtn;

	@FindBy(xpath="//li[@id='scheduleBlock']/div[2]/div[7]/div/div/div[2]/a")
	WebElement continueBtn3;

	@FindBy(xpath="//div[@id='customerDeclarationForCovid19']/div/div/div[3]/p/label")
	WebElement cheakBox;

	@FindBy(xpath="//div[@id='customerDeclarationForCovid19']/div/div/div[4]/button")
	WebElement continueBtn4;

	@FindBy(id="bookOrder")
	WebElement bookBtn;


	public SchedulePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public  void clickOnDateBtn(WebDriver driver)
	{
		WebDriverWait   wait   = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(datebtn));
		datebtn.click();
	} 

	public void clickONtimebtn(WebDriver driver) 
	{
		WebDriverWait wait     = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(timebtn));
		timebtn.click();
	}

	public void clickOncontinueBtn3(WebDriver driver)
	{
		WebDriverWait     wait    = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn3));
		continueBtn3.click();
	}
	public void clickOncheakBox(WebDriver driver)
	{
		WebDriverWait  wait   = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(cheakBox));
		cheakBox.click();
	}

	public void clickOncontinueBtn4( WebDriver driver)
	{
		WebDriverWait   wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn4));
		continueBtn4.click();
	}
	public void clickONbookBtn(WebDriver driver)
	{
		WebDriverWait  wait     = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(bookBtn));
		bookBtn.click();
	}


}