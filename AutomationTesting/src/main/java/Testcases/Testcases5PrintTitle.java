package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcases5PrintTitle {
	WebDriver driver;
	@BeforeTest
	public void Launchbrowser() throws InterruptedException	{
			System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			 }
	@AfterTest
	public void closebrowser() {
		driver.close();
	}
	@Test
	public void print() {
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		Reporter.log(title,true);
		System.out.println("the title of the page is:  " +title);
		
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		System.out.println("the URL of the Web page is:  " +url);
		
		String sourse= driver.getPageSource();
		Reporter.log(sourse,true);
		
         
			}
	}

