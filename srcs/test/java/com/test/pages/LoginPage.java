package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.genrics.ReadProperties;


public class LoginPage 
{

	@FindBy(xpath ="//div[@id='react-view']/div/div/div[2]/div/section/div/div[9]/div/div/div/b")
	private WebElement cityName;

	@FindBy(xpath="//section[@id='top-head-height']/div/nav/div/div/div[3]/ul/li[3]/div")
	private WebElement loginButton;

	@FindBy(xpath="//div[@id='loginModal']/div/div/div[2]/div/div[2]/div[4]/div/a")
	private WebElement signInButton;

	@FindBy(xpath="//div[@id='loginModal']/div/div/div[2]/div/div/div/div/div/input")
	private WebElement userNameTxtBx;

	@FindBy(id="signin-password")
	private WebElement passwordNameTxtBx;

	@FindBy(xpath="//div[@id='loginModal']/div/div/div[2]/div/div/div[2]/div/div")
	private WebElement signButton;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnCityName(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(cityName));
		cityName.click();
	}

	public void clickOnloginButton(WebDriver driver ) 
	{  
//		WebDriverWait  wait    = new WebDriverWait(driver , 10);
//		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
//	    loginButton.click();
	   Actions act =  new Actions(driver);
	   act.moveToElement(loginButton).click().build().perform();
	}
	public void clickOnsignInButton(WebDriver driver)
	{
		WebDriverWait wait	= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(signInButton));
		signInButton.click();
		// Actions act = new Actions(driver);
		//  act.moveToElement(signInButton).click().perform();
	}
	public void enterUserNameTxtBx( WebDriver driver,String username)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(userNameTxtBx));
		userNameTxtBx.clear();
		userNameTxtBx.sendKeys(username);
	}
	public void enterPasswordNameTxtBx( WebDriver driver,String password)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(passwordNameTxtBx));
		passwordNameTxtBx.clear();
		passwordNameTxtBx.sendKeys(password);
	}

	public void clickOnSignButton(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(signButton));
		signButton.click();
	}

}











