import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationHierarchyEX1 {
	
	@BeforeSuite
	public void Sample(){
		System.out.println("Before Suite");
		}
	@BeforeTest
	public void Sample1(){
		System.out.println("Before Test");
	}
	@BeforeClass
	public void Sample3(){
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void Sample4(){
		System.out.println("Before Method ");
		}
	@Test
	public void Actualtestcase1(){
		System.out.println(" Actual testcase1 ");
		}
	@Test
	public void Actualtestcase2(){
		System.out.println(" Actual testcase2 ");
		}
	@AfterSuite
	public void Sample5(){
		System.out.println("After Suite");
		}
	@AfterTest
	public void Sample6(){
		System.out.println("After Test");
	}
	@AfterClass
	public void Sample7(){
		System.out.println("After Class");
	}
	@AfterMethod
	public void Sample8(){
		System.out.println("After Method ");
		}
	
	
		
		
		

}
