package raj;

import org.testng.annotations.Test;

public class EX1Priority {
	@Test(priority=0)
	public void Order() {
		System.out.println("six");
	}
	@Test(priority=3)
	public void test1() {
		System.out.println("two");
	}
	@Test(priority=4)
	public void Apple() {
		System.out.println("one");
	}
	@Test(priority=2)
	public void Order1() {
		System.out.println("three");
	}
	@Test(priority=1)
	public void Order3() {
		System.out.println("four");
	}


}
