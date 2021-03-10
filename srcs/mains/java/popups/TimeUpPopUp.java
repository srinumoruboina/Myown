package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeUpPopUp 
{
static
{
	WebDriverManager.chromedriver().setup();
}
@Test
    public static void ClickOnTimeUpPopUp()
    {
	WebDriver  driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.xpath("//div[@id='javascriptAlertsWrapper']/div[2]/div[2]/button")).click();
	try {
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert    timepopup    = driver.switchTo().alert();
		String alerttext      =timepopup.getText();
		timepopup.accept();
		
		
	} catch (Exception e)
	{
		e.printStackTrace();
		// TODO: handle exception
	}
	
    }
}
