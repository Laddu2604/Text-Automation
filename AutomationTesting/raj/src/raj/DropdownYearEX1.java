package raj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownYearEX1 {

	
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
	    System.out.println("Year Dropdown :: ");
        WebElement yearDropdown=driver.findElement(By.id("year"));
        Select sel2 = new Select(yearDropdown);

        List<WebElement> yearValues =sel2.getOptions();

        System.out.println("the number of values in the dropdown : "+yearValues.size());
        for (int i=0;i<yearValues.size();i++){
            System.out.println(yearValues.get(i).getText());

	}

}
}