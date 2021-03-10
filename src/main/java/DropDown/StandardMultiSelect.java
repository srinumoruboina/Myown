package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandardMultiSelect 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver     =new ChromeDriver(); 
		driver.get("https://demoqa.com/select-menu");
		WebElement element   = driver.findElement(By.id("cars"));
		Select se        = new Select(element);
		System.out.println(se.isMultiple());
		se.selectByIndex(0); 
		Thread.sleep(2000);
		se.selectByValue("audi");
		Thread.sleep(1000);
		se.selectByVisibleText("Opel");
		se.deselectByIndex(2);
		Thread.sleep(1000);
		List<WebElement>  options   = se.getOptions();
		System.out.println(options.size());
		System.out.println("----------------------");
		for (WebElement webElement : options) 
		{
			String text=  webElement.getText();
			System.out.println(text);
		}
		Thread.sleep(2000);
		System.out.println("---------------------------------");
		 WebElement   first= se.getFirstSelectedOption();	
                 System.out.println(first.getText());
                 System.out.println("-----------------------");
          List < WebElement>  all     = se.getAllSelectedOptions();
                          for (WebElement webElement : all)
                          {
                        	  
                            String   text1 	=  webElement.getText();
                              System.out.println(text1);
							
						}

	}

}
