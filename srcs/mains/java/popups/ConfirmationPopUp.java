package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationPopUp 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test

	public static void clickOnConfirmationPopUp() 
	{
		WebDriver  driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		try {
			driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[3]/div[2]/button")).click();
			 WebDriverWait  wait = new WebDriverWait(driver, 10);
			 wait.until(ExpectedConditions.alertIsPresent());
			Alert   conformalert    = driver.switchTo().alert(); 
			String     alerttext  = conformalert.getText();
			System.out.println("alerttext is:"+alerttext);
			conformalert.accept();
			//conformalert.dismiss();

		} catch (Exception e) 
		{
			e.printStackTrace();// TODO: handle exception
		}

	}
}

