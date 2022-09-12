
  import static org.openqa.selenium.support.locators.RelativeLocator.*;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver;
  
  public class Relativepath {
  
  public static void main(String[] args) throws InterruptedException { // TODO
  //Auto-generated method stub
  
  System.setProperty("webdriver.chrome.driver",
  "/Users/sijo/Downloads/chromedriver"); WebDriver driver=new ChromeDriver();
  
  driver.get("https://rahulshettyacademy.com/angularpractice/");
  Thread.sleep(4000);
  
  WebElement name=driver.findElement(By.cssSelector("input[name='name']"));
  System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
  
  
  WebElement dob=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
  driver.findElement(with(By.tagName("input")).below(dob)).click();
  
  
  
  WebElement icecream=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
  driver.findElement(with(By.tagName("input")).toLeftOf(icecream)).click();
 
 
  
  
  WebElement id=driver.findElement(By.id("inlineRadio1"));
  System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(id)).getText());
  
  
  
  
 
  
  }
  
  }
 