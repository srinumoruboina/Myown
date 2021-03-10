package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampleopopup 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test
	public static void clicKoNSamplePopup() throws InterruptedException
	{
		WebDriver   driver   = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		try {
			WebDriverWait  wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());

			Alert  text     =  driver.switchTo().alert();
			String sample     =  text.getText();
			System.out.println("sample text is:"+sample);
			Thread.sleep(1000);
			text.accept();

		} catch (Exception e) 
		{
			e.printStackTrace();// TODO: handle exception
		}

	}
}
