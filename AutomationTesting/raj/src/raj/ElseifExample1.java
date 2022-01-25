package raj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElseifExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String browser = "chrome";
  if (browser.equals("chrome")){System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
	//Maximize the browser
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	}
  else if (browser.equals("google")) {
	}
  
  
	}
}