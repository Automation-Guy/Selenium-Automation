package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AllSeleniumConcepts {

	public WebDriver driver;

	@BeforeTest
	public void init() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver = new ChromeDriver(ops);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.qaclickacademy.com/");
		WebElement Practise = driver.findElement(By.xpath("//a[contains(.,'Practice')]"));
		Practise.click();
	}

	@Test(priority = 0)
	public void checkBoxes() throws InterruptedException {

		Thread.sleep(2000);
		WebElement box1 = driver.findElement(By.id("checkBoxOption1"));
		box1.click();

		WebElement box2 = driver.findElement(By.id("checkBoxOption2"));
		box2.click();

		WebElement box3 = driver.findElement(By.id("checkBoxOption3"));
		box3.click();
		Thread.sleep(2000);

	}

	@Test(priority = 1)
	public void dropDowns() throws InterruptedException {

		WebElement dd = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dd);
		Thread.sleep(2000);
		s.selectByValue("option1");

		Thread.sleep(2000);
		s.selectByValue("option2");

		Thread.sleep(2000);
		s.selectByValue("option3");

		Thread.sleep(2000);

		Actions actions = new Actions(driver);

		WebElement type = driver.findElement(By.cssSelector("input[id='autocomplete']"));
		type.sendKeys("Ind");

		WebElement values = driver.findElement(By.xpath("//li[@class='ui-menu-item']/div[text()='India']"));
		actions.moveToElement(values).click().build().perform();

	}

	@Test(priority = 2)
	public void radioButtons() throws InterruptedException {

		Thread.sleep(1000);
		WebElement radio1 = driver.findElement(By.cssSelector("input[value='radio1']"));
		radio1.click();
		System.out.println(radio1.isSelected());
		WebElement radio2 = driver.findElement(By.cssSelector("input[value='radio2']"));
		radio2.click();
		System.out.println(radio1.isSelected());
		WebElement radio3 = driver.findElement(By.cssSelector("input[value='radio3']"));
		radio3.click();
		System.out.println(radio1.isSelected());
		Thread.sleep(1000);
	}

	@Test(priority = 3)
	public void newWindow() throws InterruptedException {

		String oldWindow = driver.getWindowHandle();
		WebElement newWindow = driver.findElement(By.id("openwindow"));
		newWindow.click();

		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(1000);
		WebElement courses = driver.findElement(By.xpath("//a[text()='Courses']"));
		courses.click();
		System.out.println(driver.getTitle());

	}

	/*
	 * @Test public void frames() {
	 * 
	 * 
	 * }
	 * 
	 * @Test public void mouseAndKeyboard() {
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Test public void BrowserNavigation() {
	 * 
	 * 
	 * }
	 * 
	 * @Test public void webTable() {
	 * 
	 * 
	 * }
	 * 
	 * 
	 */
	 
	 @Test 
	 public void dataProvider(String userName, String Password) {
		 
		 
		 
	 
	  }
	 
	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

	@AfterTest
	public void quit() {

		driver.quit();
	}
}
