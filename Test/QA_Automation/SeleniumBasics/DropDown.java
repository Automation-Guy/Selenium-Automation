package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Dropdown Class
public class DropDown {
	
	public static WebDriver driver;
	
	@Test(priority=0)
	public void example() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for (WebElement wb : link) {
			String value = wb.getAttribute("href");
			System.out.println(value);
			
		}
	
		driver.quit();
	}
	
	@Test(priority=1, description="Select fucntion for Dropdown", groups="Smoke")
	public void selectfun() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@name='country']"));
		
		
		for (WebElement webElement : dropdown) {
			
			String name = webElement.getText();
			System.out.println(name);
			
		}
		
		Select s = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		s.selectByValue("Iceland");
        Thread.sleep(5000);	
        driver.quit();
	}

	
}
