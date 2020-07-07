package SeleniumBasics;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelDropdown {
	
	WebDriver driver;
	
	private By nameofUser = By.id("username");
	
	
	public By getNameofUser() {
		return nameofUser;
	}



	@BeforeTest
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("batchautomation");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Test@12345");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("input[class='btn btn-small']"));
		loginBtn.click();
	}
	
	
/*	@Test()
	public void dropNDown() throws InterruptedException {
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		
		WebElement dropDown = driver.findElement(By.cssSelector("select[name='search_target']"));
		
		Select s = new Select(dropDown);
		s.selectByValue("WEB");
		
		WebElement searchBtn = driver.findElement(By.cssSelector("input[src*='search']"));
		searchBtn.click();	

	}*/
	
	@Test(priority=0)
	public void alert() throws InterruptedException {
		
        Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		
		WebElement navMenu = driver.findElement(By.cssSelector("a[title='Alerts']"));
		navMenu.click();
		
		WebElement contacts = driver.findElement(By.name("object_type"));
		Select ss = new Select(contacts);
		ss.selectByValue("TASK");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open()");
		
		Thread.sleep(4000);
		
		

		
		driver.quit();
		
		
	}
	
	public static void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	

}
