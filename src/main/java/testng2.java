import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng2 {
	
@Test
	public void thirdtest() {
		
		System.out.println("3rd test");
	}
	

@Test
public void fourthtest() {
	
	System.out.println("4th test");
}


@AfterTest
public void Aftertest1() {
	
	System.out.println("I will execute last");
}

	
}
