package raj;


//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class x {

	public static void main(String[] args) {


		// TODO Auto-generated method stub
    //launch_google
		System.setProperty ("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		//Maximize the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("hai");
		
		// navigate to URL
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("rajini");
		driver.findElement(By.name("lastname")).sendKeys("reddy");
		driver.findElement(By.name("reg_email__")).sendKeys("rajiniram2604@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("rajini@2604");
		
		WebElement k = driver.findElement(By.name("birthday_day"));
		Select obj = new Select(k);
		obj.selectByValue("1");
		
		WebElement M = driver.findElement(By.name("birthday_month"));
		Select obj1 = new Select(M);
		obj.selectByValue("2");
		
		WebElement Y = driver.findElement(By.name("birthday_year"));
		Select obj2 = new Select(Y);
		obj.selectByValue("1988");
		
		
		//WebElement  X = driver.findElement(By.id("Form_submitForm_subdomain"));
		//X.sendKeys("XXX");
		
		//WebElement ram =driver.findElement(By.id("Form_submitForm_Country"));
				
		
		
		
		//obj.selectByVisibleText()
		
		
				
		//WebElement  Z= driver.findElement(By.name("login"));
				//Z.click();
		

}

}

