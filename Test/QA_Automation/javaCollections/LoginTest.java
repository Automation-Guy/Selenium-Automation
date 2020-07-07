package javaCollections;

import org.testng.annotations.Test;

import POM.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void doLoginTest() {
		String title = page.getInstance(LoginPage.class).getTitlePage();
		System.out.println(title);
	}

}
