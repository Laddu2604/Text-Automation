package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

  
public class Testcase1scroll {
	
	WebDriver driver;
	@BeforeTest
	public void Launchbrowser() throws InterruptedException	{
			System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("http://automationpractice.com/index.php");
			 }
	
	@Test
	public void scrollTest() throws IOException
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	          js.executeScript("window.scrollBy(0,1000)", "");
	          File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshotFile , new File("C:\\snap2\\screenshotname.png"));
				
				js.executeScript("scroll(0, -650);");

	}
	@AfterTest
	 public void closeBrowser() {
			driver.close();
		}
  }
	 
