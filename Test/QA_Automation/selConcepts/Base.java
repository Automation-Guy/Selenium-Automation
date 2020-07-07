package selConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	public static WebDriver driver;

	public static void initialization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.google.com");

	}
	
	public void failed() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(
					"failshot_" + this.getClass().getName() + "_" + ".png"));
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
