package raj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) {
		
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		//Maximize the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("the title of the page is:  " +title);
		
		String url = driver.getCurrentUrl();
		System.out.println("the URL of the Web page is:  " +url); 
		 
		
	}

}
