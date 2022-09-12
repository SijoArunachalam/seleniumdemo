/*
 * import java.io.File; import java.io.IOException; import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.JavascriptExecutor;
 * import org.openqa.selenium.OutputType; import
 * org.openqa.selenium.TakesScreenshot; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.chrome.ChromeOptions; import
 * org.apache.commons.io.FileUtils;
 * 
 * 
 * public class driverwindowmanager {
 * 
 * public static void main(String[] args) throws InterruptedException,
 * IOException { // TODO Auto-generated method stub
 * 
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "/Users/sijo/Downloads/chromedriver");
 * 
 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
 * driver.manage().deleteAllCookies(); driver.get("https://google.com");
 * Thread.sleep(5000); System.out.println(driver.getTitle()); File
 * src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 * FileUtils.copyFile(src,new
 * File("/Users/sijo/Desktop/demo/screenshot/screenshot.png"));
 * 
 * 
 * driver.close();
 * 
 * 
 * 
 * }
 * 
 * }
 */