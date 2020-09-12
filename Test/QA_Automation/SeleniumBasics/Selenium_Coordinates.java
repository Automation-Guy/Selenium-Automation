package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Coordinates {
	
	public WebDriver driver;
	 
	
	@Test
	public void Chase() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement ele = driver.findElement(By.cssSelector("img[alt*='Find a Credit Card.']"));
		
		
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
		Point point = ele.getLocation();
		int xcord = point.getX();
		System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		int ycord = point.getY();
		System.out.println("Position of the webelement from top side is "+ycord +" pixels");
		 
		Actions action = new Actions(driver);
		                
		action.moveToElement(ele, xcord, ycord).click().build().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
