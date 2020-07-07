package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {
	
	WebDriver driver;
	
	@Test
	public void navigateMethods() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		driver.findElement(By.linkText("Forgot password?")).click();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		String homePage = driver.getTitle();
		
		System.out.println("The title of current Page is:"+ homePage);
		
		driver.navigate().forward();
		
		String currentPage = driver.getTitle();
		
		System.out.println("The title of current Page is:"+ currentPage);
				
		
		
	}

}
