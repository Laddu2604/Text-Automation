import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AnnotationEX2 {

	int a=20;
	int b=40;
	
	@BeforeClass 
	public void method1() {
		System.out.println("start the program");
	}
	@Test
	public void Addition() {
		System.out.println("addition is : "+(a+b));
	}
	@Test
	public void substraction() {
		System.out.println("subsraction is : "+(a-b));
	}
	@Test
	public void Multiplication() {
		System.out.println("multiplication  is : "+(a*b));
	}
	@Test
	public void Division() {
		System.out.println("Division is : "+(a/b));
	}

	@BeforeMethod 
	public void test2() {
		System.out.println("start the program1");
	
}
	@AfterMethod 
	public void test3() {
		System.out.println(" the program completed");
	
}
	
	@AfterClass 
	public void program() {
		System.out.println(" the program end");
	}
}