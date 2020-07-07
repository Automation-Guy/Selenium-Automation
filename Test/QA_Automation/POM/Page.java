package POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 15);
		
	}
	
	public abstract String getTitle();

	public abstract WebElement getElement(By locator);
	
	public abstract String getPageHeader(By locator);
	
	public abstract void WaitForElementPresent(By Locator);
	
	public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> pageClass) {
		
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception e) {
			e.printStackTrace();
			return null; 
		}
		
	}
}
