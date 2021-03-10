package com.test.genrics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utiles 
{
	public static String captureScreenShot(WebDriver driver)
	{
		TakesScreenshot          ts   =   (TakesScreenshot ) driver;
		String screenshot	 =ts.getScreenshotAs(OutputType.BASE64);
		return  screenshot;
	}}