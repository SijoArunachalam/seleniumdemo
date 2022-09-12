import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	
@Test
public void firsttest() {
		
		System.out.println("1st test");
	}
	

@Test
public void secondtest() {
	
	System.out.println("2nd test");
}

@BeforeTest
public void beforetest1() {
	
	System.out.println("I will execute first");
}


	
}
