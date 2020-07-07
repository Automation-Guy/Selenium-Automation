package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private By UserName = By.id("");
	private By Password = By.id("");
	private By LoginButton = By.xpath("");
	private By HeaderPage = By.name("");
	
	public WebElement getUserName() {
		return getElement(UserName);
	}
	
	public WebElement getPassword() {
		return getElement(Password);
	}
	
	public WebElement getLoginButton() {
		return getElement(LoginButton);
	}
	
	public String getTitlePage() {
		return getTitle();
	}
	
	public String getHeader() {
		return getPageHeader(HeaderPage);
	}
	
	public HomePage doLogin(String username, String password) {
		
		getUserName().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
		
		
		return getInstance(HomePage.class);
	}
	
}
