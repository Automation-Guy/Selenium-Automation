package Selenium4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.collect.Multiset.Entry;

import io.github.bonigarcia.wdm.WebDriverManager;


public class devTools {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		DevTools devtools = ((ChromiumDriver)driver).getDevTools();
//		devtools.createSession();
//		devtools.send(Log.enable());
//		devtools.addListener(Log.entryAdded(), entry ->  System.out.println(entry.getLevel()));
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
