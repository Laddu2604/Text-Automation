package raj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIDEX1 {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		//Maximize the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
    driver.get("https://www.facebook.com/login.php");
   driver.findElement(By.id("email")).sendKeys("wwwww");
   driver.findElement(By.id("pass")).sendKeys("password");
	}


	}


