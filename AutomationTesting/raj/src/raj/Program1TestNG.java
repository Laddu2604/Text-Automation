import org.junit.Test;

public class Program1TestNG {

	int a=100;
	int b=20;
	public void add() {
		System.out.println(a+b);
	}
		public void sub() {
			System.out.println(a-b);
		}
			public void div() {
				System.out.println(a/b);
			}
				public void mul() {
					System.out.println(a*b);
				}
			
		
	@Test
	public void callTests(){
		Program1TestNG ss=new Program1TestNG();
		ss.add();
		ss.sub();
		ss.div();
		ss.mul();
		
	}
	}
	
	
	
		

	


