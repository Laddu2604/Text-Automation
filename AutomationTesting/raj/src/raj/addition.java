import org.junit.Test;

public class addition {

	int a=10;
	int b=10;
	
	

public void add() {
	System.out.println(a+b);
}

public void sub() {
	System.out.println(a-b);
}



@Test
public void calltestcases() {
	addition obj = new addition();
	obj.add();
	obj.sub();
}

}