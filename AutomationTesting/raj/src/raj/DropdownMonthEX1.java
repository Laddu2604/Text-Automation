package raj;

import java.util.List;

import org.openqa.selenium.support.ui.Select;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownMonthEX1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		//Maximize the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
    driver.get("https://www.facebook.com/");
    System.out.println("first title"+driver.getTitle());

    WebElement newAccountLink =driver.findElement(By.xpath("//a[text()='Create New Account']"));

    newAccountLink.click();
    Thread.sleep(2000);

    System.out.println("Month Dropdown :: ");
    WebElement monthDropdown=driver.findElement(By.id("month"));
    Select sel1 = new Select(monthDropdown);

    List<WebElement> monthValues =sel1.getOptions();

    System.out.println("the number of values in the dropdown : "+monthValues.size());

    for (int i=0;i<monthValues.size();i++){
        System.out.println(monthValues.get(i).getText());
    

    }
	}
}



