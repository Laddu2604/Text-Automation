package raj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Xpathex2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		//Maximize the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
    driver.get("http://demo.guru99.com/test/newtours/register.php");
    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("SUBBA");
    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("RAM");
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");
    driver.findElement(By.xpath("//input[@name='userName'and @id='userName']")).sendKeys("RAJINIRAM");
    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("HYD");
    Thread.sleep(10000);
    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("kadapa");
    driver.findElement(By.xpath("//input[@name='state']")).sendKeys("AP");
    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("516172");
    driver.findElement(By.xpath("//input[@id='email' or name='email']")).sendKeys("rajini@2604");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("2604");
    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("2604");
	}


	


	}


