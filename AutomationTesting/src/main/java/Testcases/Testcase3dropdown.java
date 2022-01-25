package Testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase3dropdown {
	WebDriver driver;
	@BeforeTest
public void Launchbrowser() throws InterruptedException	{
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://www.facebook.com/");
	}
	
		 
		 @Test
		 public void Testing1 () throws IOException, InterruptedException {
				
				
		   System.out.println("first title"+driver.getTitle());

		    WebElement newAccountLink =driver.findElement(By.xpath("//a[text()='Create New Account']"));

		    newAccountLink.click();
		    
		    System.out.println("Day Dropdown : ");
		    Thread.sleep(2000);
		    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile , new File("C:\\snap1\\screenshotname.png"));
			
			}



		 @AfterTest
		 public void closeBrowser() {
				driver.close();
			}
	 
}