import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeInvoke {

	public static void main(String[] args) throws InterruptedException, SQLException {
		
		
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port= "3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qa", "root", "adminroot");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employeeinfo where name=\"Sijo\";");
		rs.next();
		String name=(rs.getString("name"));
		System.out.println(name);
		
		System.setProperty("webdriver.chrome.driver", "/Users/sijo/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.className("gNO89b")).click();
		
		

	}

}
