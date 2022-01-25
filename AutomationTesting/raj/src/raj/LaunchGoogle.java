import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchGoogle {
	
	@Test
public void google() {
	
	
	System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
	//Maximize the browser
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
driver.get("https://www.google.com");




}
}
