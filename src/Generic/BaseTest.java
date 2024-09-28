package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest 
{
	public WebDriver driver;
	@Parameters("browser")
	
	@BeforeClass
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://online.actitime.com/sambhu/login.do");
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://online.actitime.com/sambhu/login.do");
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://online.actitime.com/sambhu/login.do");
		}
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
