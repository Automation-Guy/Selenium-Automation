package InterviewPro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReader {
	
	@Test(dataProvider="LoginData")
	public void reader(String username, String password) {
		
		System.out.println("Data Passed");
		
	}
	
	
	@DataProvider(name="LoginData")
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		data [0][0]= "asbc@gmail.com";
		data [0][1]= "Pass";
		
		data [1][0]= "asbc@gmail.com";
		data [1][1]= "Password";
		
		data [2][0]= "asbc@gmail.com";
		data [2][1]= "Password1";
		
		return data;
		
	}

}
