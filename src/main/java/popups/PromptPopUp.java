package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptPopUp
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test
	public static void clickOnPromptPopUp() 
	{
		WebDriver   driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		try {
			WebDriverWait  wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert  prompt  =driver.switchTo().alert();
			String   text    =prompt.getText();
			System.out.println("prompt text alert text is:"+ text);

			prompt.sendKeys("alert");

			prompt.accept();

		} catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}

	}
}
