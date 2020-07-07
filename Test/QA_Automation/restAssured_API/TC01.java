package restAssured_API;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC01 {
	
	public static String URI = "http://restapi.demoqa.com/utilities/weather/city/Delhi";
	
	public static String payload = "\"FirstName\",\"Johna\",\r\n" + 
			"\"LastName\",\"aJohn\",\r\n" + 
			"\"UserName\",\"Johna\",\r\n" + 
			"\"Password\",\"Johna\",\r\n" + 
			"\"Email\",\"Johna@gmail.com\"";
	
	@Test
	public void POST() {
		
		Response response = given().
				            get(URI);
		
		String rs = response.getBody().asString();
		System.out.println(rs);
				         
	}

}
