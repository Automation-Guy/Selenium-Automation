package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{

	public BasePage(WebDriver driver) {
		super(driver);
		
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	public WebElement getElement(By locator) {
		WaitForElementPresent(locator);
		WebElement element = null;
		try 
		{
		element = driver.findElement(locator);
		return element;
		} catch(Exception e) {
			System.out.println("Error Occured while creating an Element" + locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public void WaitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
