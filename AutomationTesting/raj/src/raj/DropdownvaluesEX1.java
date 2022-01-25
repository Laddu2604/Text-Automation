package raj;

import java.util.List;
import org.openqa.selenium.support.ui.Select;

import com.rajcom.raj.base.CommonActions;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownvaluesEX1 extends CommonActions{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		//Maximize the browser
		WebDriver driver = new ChromeDriver();
		CommonActions obj = new CommonActions();
		driver.manage().window().maximize();
		
    driver.get("https://www.facebook.com/");
    System.out.println("first title"+driver.getTitle());

    WebElement newAccountLink =driver.findElement(By.xpath("//a[text()='Create New Account']"));

    newAccountLink.click();
    Thread.sleep(3000);
    System.out.println("Day Dropdown : ");
    

  

	}
}

	


