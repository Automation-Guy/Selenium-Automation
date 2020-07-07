package restAssured_API;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class basic {
	
	public static String first = "http://restapi.demoqa.com/utilities/weather/city";
	public static String second = "http://restapi.demoqa.com/customer";
	
	@Test(priority=0, description="Get Method")
	public void GET() {
		
		RequestSpecification req1 = given().baseUri(first);
		
		Response response = req1.request(Method.GET, "/Ahmedabad");
		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		
	}
	
	@SuppressWarnings("unchecked")
	@Test(priority=1, description="POST Method")
	public void POST() {
		
		RequestSpecification req2 = given().baseUri(second);
		
		JSONObject requestparams = new JSONObject();
		
		  requestparams.put("FirstName","JohnaZ");
		  requestparams.put("LastName","aZJohn");
		  requestparams.put("UserName","JohnaZ");
		  requestparams.put("Password","JohnaZ");
		  requestparams.put("Email","JohnaZ@gmail.com");
		  
		  req2.header("Content-Type","application/json");
		  req2.body(requestparams.toJSONString());
		  
		  //Response object
		  Response response=req2.request(Method.POST,"/register");
		  
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  Assert.assertEquals(response.getStatusCode(), 201);
}
}
