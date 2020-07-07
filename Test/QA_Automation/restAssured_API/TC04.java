package restAssured_API;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class TC04 {
	
	public static String basicURL;
	
	@Test(priority=1)
	public void getStatusCode() {
		
                        given()
				       .when()
				           .get("https://www.google.com")
				       .then()
				          .assertThat()
				          .statusCode(200);
                       
		
	}
	
	@Test(priority=2)
	public void getresponseBody() {
		
		given()
	   .when()
	      .get("https://petstore.swagger.io/v2/store/inventory")
	   .then()
	   .assertThat()
	   .statusCode(200);
	}
	
	@Test
	public void getPOSTMethod() {
		
		given()
		.header("Accept","application/json")
		.body("order placed for purchasing the pet")
		.when()
		.post("https://petstore.swagger.io/v2/store/order")
		.then()
		.assertThat()
		.statusCode(415);
	}
	
}
