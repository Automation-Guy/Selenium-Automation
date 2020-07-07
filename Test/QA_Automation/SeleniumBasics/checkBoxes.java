package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBoxes {
	
	public static WebDriver driver;
	
	@Test
	public void checkBConcept() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//we can use list also to select specific checkbox using select fucntion
		
     /*	for(int i=1;i<=4;i++) {
		WebElement one = driver.findElement(By.xpath("//div[4]/input["+i+"]"));
		one.click();
	}*/
		
		int i=1;
		int count=0;
		while(i<=4) {
		WebElement one = driver.findElement(By.xpath("//div[4]/input["+i+"]"));
		one.click();
		i++;
		count++;
}
		System.out.println("Total count Number is: " + count);
}
}