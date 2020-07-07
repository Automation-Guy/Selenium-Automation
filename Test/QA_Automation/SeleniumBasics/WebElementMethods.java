package SeleniumBasics;

import org.apache.groovy.json.internal.Chr;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {
	
	WebDriver driver;
	
	@Test
	public void ElementsMethods() {
		
		/*Methods(): clear,
		           click(),
		           findElement(),
		           sendKeys(),
		           submit(),
		           getAttribute(),
		           getText()*/
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		
	}

}
