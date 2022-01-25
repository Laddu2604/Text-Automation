package raj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameEX1 {

	public static void main(String[] args) {
		
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		//Maximize the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
    driver.get("https://www.facebook.com/");
    System.out.println("first title"+driver.getTitle());

    WebElement newAccountLink =driver.findElement(By.xpath("//a[text()='Create New Account']"));

    System.out.println("tagname of create new account link is : "+newAccountLink.getTagName());

    System.out.println("attribute vaule of class is : "+newAccountLink.getAttribute("class"));
    System.out.println("attribute vaule of data testid is :"+newAccountLink.getAttribute("data-testid"));
    System.out.println("attribute vaule of id is : "+newAccountLink.getAttribute("id"));

    System.out.println(newAccountLink.getCssValue("color"));
    System.out.println(newAccountLink.getCssValue("bgcolor"));

	}

}
