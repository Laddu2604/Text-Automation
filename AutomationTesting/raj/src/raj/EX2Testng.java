import org.testng.annotations.Test;

public class EX2Testng {
	
	int a=100;
	int b=200;
	@Test
	public void calltests() {
		EX2Testng ss=new EX2Testng();
		ss.Addition();
		ss.Substraction();
	}
	public void Addition() {
		
		System.out.println("addition is : "+(a+b));
	}
		
		
		public void Substraction() {
			System.out.println("Substraction is : "+(a-b));


}
}