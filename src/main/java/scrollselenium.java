import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/sijo/Downloads/chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		
		JavascriptExecutor JS= (JavascriptExecutor)driver;
		JS.executeScript("window.scroll(0,520)");
		
		Thread.sleep(1000);

		JS.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		int amount=0;
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		for(int i=0;i<values.size();i++)
		{
		 int value=Integer.parseInt(values.get(i).getText());
		 amount = amount+value;
		 
		}
		System.out.println("calculated amout :"+amount);
		WebElement amount1=driver.findElement(By.cssSelector("div[class=totalAmount]"));
		String amount2=amount1.getText();
		int finalamount=Integer.parseInt(amount2.split(":")[1].trim());
		System.out.println("final amount in screen; "+finalamount);
		

	}

}
