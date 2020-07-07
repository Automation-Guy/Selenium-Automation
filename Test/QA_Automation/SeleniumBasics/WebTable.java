package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
public static WebDriver driver;
	
	@Test
	public void webtableConcept() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://money.rediff.com/gainers");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	List<WebElement> rows = driver.findElements(By.xpath(".//table[@class='dataTable']/tbody/tr"));
	System.out.println("Total Rows are: "+ rows.size());
	
	List<WebElement> cells = driver.findElements(By.xpath(".//table[@class='dataTable']/tbody/tr/td"));
	System.out.println("Total Rows are: "+ cells.size());
	
	for (WebElement webElement : cells) {
		
		String cellName = webElement.getText().toString().trim();
		System.out.println(cellName);
		
	}
    
	driver.quit();
}
}