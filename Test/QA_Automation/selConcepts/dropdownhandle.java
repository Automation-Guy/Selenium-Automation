package selConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownhandle {
	
	
	public static void main(String a[]) throws InterruptedException{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_dropdown-menu&stacked=h");
		driver.switchTo().frame(1);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown Example')]")).click();
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//button[contains(text(),'Dropdown Example')]//following-sibling::ul//li//a"));
		System.out.println(dropdown.size());
		
		for(int i=0;i<dropdown.size();i++){
			String name = dropdown.get(i).getText();
			System.out.println(name);
			if(name.equals("CSS")){
				dropdown.get(i).click();
				break;
			}
		}
		
	}
	
	
	

}
