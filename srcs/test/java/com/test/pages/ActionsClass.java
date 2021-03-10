package com.test.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.genrics.BaseTest;

public class ActionsClass 
{
    @FindBy(xpath ="//div[@id='react-view']/div/div/div[2]/div/section/div/div[9]/div/div/div/b")
	private WebElement cityName;
	
   @FindBy(xpath="//section[@id='top-menu-height']/div/div/ul[2]/li[6]")
   WebElement homeconstructionBtn;
   
   @FindBy(xpath="//div[@id='home-construction36']/div/div/div/ul/li[1]")
   WebElement constructionBtn;
   
   public ActionsClass(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void clickOnCityName(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(cityName));
		cityName.click();
	}
   
   public void clickOnConstructionBtn(WebDriver driver)
   {
	   Actions actions = new Actions(driver);
	   actions.moveToElement(homeconstructionBtn).click().build().perform();
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   wait.until(ExpectedConditions.elementToBeClickable(constructionBtn));
	   constructionBtn.click();
   }
}
