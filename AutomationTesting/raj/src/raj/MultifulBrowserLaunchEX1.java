import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultifulBrowserLaunchEX1 {
 
	WebDriver driver;
	
	@BeforeMethod
	
	public void LaunchBrowser() {
		
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	public void naviagteToURL(String url){ 
		driver.get(url);
	}
	public String getTitle() {
		return driver.getTitle();
		
	}
	public String getURL() {
		return driver.getCurrentUrl();
	}
	@Test
	public void Sampleprogram() {
		MultifulBrowserLaunchEX1 ss= new MultifulBrowserLaunchEX1();
		ss.LaunchBrowser();
		ss.naviagteToURL("https://www.google.com");
		System.out.println(ss.getTitle());
		System.out.println(ss.getURL());
		
	} 
	@Test
	public void Sampleprogram1() {
		MultifulBrowserLaunchEX1 ss= new MultifulBrowserLaunchEX1();
		ss.LaunchBrowser();
		ss.naviagteToURL("https://www.amazon.com");
		System.out.println(ss.getTitle());
		System.out.println(ss.getURL());
		
	} 
	@Test
	public void Sampleprogram2() {
		MultifulBrowserLaunchEX1 ss= new MultifulBrowserLaunchEX1();
		ss.LaunchBrowser();
		ss.naviagteToURL("https://www.flipkart.com");
		System.out.println(ss.getTitle());
		System.out.println(ss.getURL());
		
	} 
	@Test
	public void Sampleprogram3() {
		MultifulBrowserLaunchEX1 ss= new MultifulBrowserLaunchEX1();
		ss.LaunchBrowser();
		ss.naviagteToURL("https://www.facebook.com");
		System.out.println(ss.getTitle());
		System.out.println(ss.getURL());
		
	} 
     @AfterMethod
	
	public void closeBrowser() {
		driver.close();
	}
	
	
}
