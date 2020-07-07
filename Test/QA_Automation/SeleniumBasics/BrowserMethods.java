package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethods {
	
	public WebDriver driver;
	
	@Test
	public void methods() {
		
	/*	6 browser Methods:   get(), 
		                     getTitle(),
		                     getPageSource(),
		                     close(),
		                     quit(), 
		                     getCurrentURL()*/
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.LinkedIn.com");
		
		String stringURL = driver.getCurrentUrl();
		System.out.println("What is the CurrentURL: "+ stringURL);
		
		String title = driver.getTitle();
		System.out.println("The current Title of the WebPage is: "+ title);
		
		System.out.println(driver.getPageSource());
		
		driver.quit();
	}

}
