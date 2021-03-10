package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	@Test
	public static void frameHandling() throws InterruptedException
	{
		WebDriver  driver      =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//header[@id='header']/../div[3]/h2"));

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,900)");
		driver.findElement(By.xpath("//header[@id='header']/../div[3]/table/tbody/tr[2]/td[6]/a[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/ul[1]/li[1]/a")).click();
		WebElement classframe	= driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//a[.='org.openqa.selenium']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[.='AbstractAnnotations']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[.='org.openqa.selenium']")).click();
		
		

	}
}
