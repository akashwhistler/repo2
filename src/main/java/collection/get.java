package collection;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class get {
	
	@Test
	public static void tc1() {
		RestAssured.baseURI="http://localhost:3000";
		//given().get("/posts/2").then().statusCode(200).log().all();
		Response res=given().get("/posts").then().statusCode(200).extract().response();
		String sres=res.asString();
		
		assertEquals(res.getStatusCode(),200);
		//assertEquals(res.jsonPath().getString("id"),"2");
		System.out.println(sres);
	}

}
