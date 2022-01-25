package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample31 {
	WebDriver driver;
	@BeforeTest
public void Inbrowser()	{
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	driver.get("https://www.google.com");

}
@Test
	public void Testing1 () throws IOException {
		String Title = driver.getTitle();
		String url = driver.getCurrentUrl();
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile , new File("C:\\snap\\screenshotname.png"));
		System.out.println(Title);
		System.out.println(url);
		Reporter.log(Title);
		Reporter.log(url);
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
}


