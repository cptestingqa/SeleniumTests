package Tenxlabs.AutomationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ExampleTest {
	
	public static WebDriver driver;

	@BeforeTest
	public static void startUp()
	{
	
		driver = new ChromeDriver();	
		
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testDownload() throws Exception 
	{
		driver.get("https://www.zoho.com/mail/ftfthttrh");
		driver.findElement(By.xpath("//div[@class='header']//div[@class='signing']//a[text()='Sign In']")).click();
		Thread.sleep(10);
		String header = driver.findElement(By.xpath("//div[@class='main']/h1")).getText();
		System.out.println("Page Title : "+ header);
		Reporter.log("Page Title : "+ header);
		System.out.println("Done");
	}
	
	@AfterTest
	public static void tearDown()
	{
		driver.close();
		driver.quit();

	}
	
}

