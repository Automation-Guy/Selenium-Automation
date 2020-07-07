package restAssured_API;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class TC05 {
	
	@Test
	public void reqSample() {
	
		
		baseURI = "http://dummy.restapiexample.com/api/v1/";
		String res = given()
		.body("{\"name\":\"Dummy11\",\"salary\":\"12233\",\"age\":\"73\"}")
	    .when()
	    .post("create")
	    .then().statusCode(200).extract().response().asString();
		
		System.out.println(res);
		
		JsonPath js = new JsonPath(res);
		String actualVal = js.getJsonObject("data.name");
		//fail scenario
		Assert.assertEquals(actualVal, "Dummy11");
		
	
	}
}
