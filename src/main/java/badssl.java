import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class badssl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option=new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "/Users/sijo/Downloads/chromedriver");
		option.setAcceptInsecureCerts(true);
        
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://expired.badssl.com");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		

	}

}
