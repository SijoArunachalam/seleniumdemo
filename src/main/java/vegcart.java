/*
 * import java.util.List; import java.util.concurrent.TimeUnit; import
 * org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class vegcart {
 * 
 * public static void main(String[] args) throws InterruptedException { // TODO
 * Auto-generated method stub
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "/Users/sijo/Downloads/chromedriver"); WebDriver driver=new ChromeDriver();
 * driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
 * driver.get("https://rahulshettyacademy.com/seleniumPractise/"); String[]
 * fruits= {"Brocolli","Cucumber","Beetroot"}; addItems(driver,fruits);
 * 
 * 
 * }
 * 
 * public static void addItems(WebDriver driver,String[] fruits) { int j=0;
 * List<WebElement> products =
 * driver.findElements(By.cssSelector("h4.product-name")); for(int
 * i=0;i<products.size();i++) { String[]
 * product=products.get(i).getText().split(" "); String
 * updatedProduct=product[0].trim();
 * 
 * if(updatedProduct.equalsIgnoreCase(fruits[j])) {
 * driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i)
 * .click(); System.out.println(fruits[j]); j++; if(j>=fruits.length) { break; }
 * 
 * }
 * 
 * } driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
 * driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
 * WebDriverWait w=new WebDriverWait(driver,5);
 * w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
 * "input.promoCode")));
 * driver.findElement(By.cssSelector("input.promoCode")).sendKeys(
 * "rahulshettyacademy");
 * driver.findElement(By.cssSelector("button.promoBtn")).click();
 * System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).
 * getText()); } }
 * 
 */