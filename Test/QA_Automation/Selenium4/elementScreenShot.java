package Selenium4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement searchElement = driver.findElement(By.cssSelector("input[class='gsc-input']"));
		
		//File srcFile = searchElement.getScreenshotAs(OutputType.FILE);
		
		TakesScreenshot src = ((TakesScreenshot)searchElement);
		
		File srcFile = src.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("./Test/screenshots/searchElementscreen.png"));
		
		driver.close();
		
	}

}
