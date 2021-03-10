package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleDropDown 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver     =new ChromeDriver(); 
		driver.get("https://demoqa.com/select-menu");
		WebElement element   = driver.findElement(By.id("oldSelectMenu"));
		Select se        = new Select(element);
		System.out.println(se.isMultiple());

		se.selectByIndex(1);
		Thread.sleep(2000);
		se.selectByIndex(3);
		Thread.sleep(2000);
		se.selectByVisibleText("Yellow");
		Thread.sleep(2000);
		se.selectByValue("6");
		List<WebElement>  options  = se.getOptions();
		System.out.println(options.size());
		for (WebElement webElement : options) 
		{
			String s   	= webElement.getText(); 
			System.out.println(s);



		}
	}
}       


