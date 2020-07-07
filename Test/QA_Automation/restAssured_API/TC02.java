package restAssured_API;

import org.testng.annotations.Test;

import com.github.writethemfirst.approvals.Approvals;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TC02 {
	
	@Test
	public void testWhiteHouseZipAll(){
		
		Response response = given().get("http://api.zippopotam.us/us/20500");
	   // Approvals.verify(response.body().prettyPrint());
		Approvals.verify(response.statusCode());
	//    response.then().statusCode(200);
//	    Response response = given().get("http://api.zippopotam.us/us/20500");
//	    String responseStr = response.headers().toString() + "\n\n" + response.body().prettyPrint();
//	    
//	    responseStr = responseStr.replaceAll("Date=.*", "#####DATE");
//	    responseStr = responseStr.replaceAll("Set-Cookie=.*", "#####COOKIE");
//	    responseStr = responseStr.replaceAll("CF-RAY=.*", "#####CF-RAY");
//	    
//	    Approvals.verify(responseStr);
	}

}
