package testng;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class geolocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "/Users/sijo/Downloads/chromedriver3");
		ChromeDriver driver=new ChromeDriver();
	     
		 DevTools devtool=driver.getDevTools();
		 		 devtool.createSession();
		 		 
		 
		 Map<String,Object> location=new HashMap<>();
		 location.put("latitude", 13);
		 location.put("longitude", 80);
		 location.put("latitude", 1);
		 
		 driver.executeCdpCommand("Emulation.setGeolocationOverride", location);
		 
		 Thread.sleep(1000);
		 
		 driver.get("https://google.com");
		 

		

	}

}
