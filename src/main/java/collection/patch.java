package collection;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class patch {
	
	@Test
	public static void tc4() {
		RestAssured.baseURI="http://localhost:3000";
		
	Response rs=	given().contentType(ContentType.JSON).body("{\n"
				+ "    \"title\":\"two2\"\n"
				+ "}").when().patch("/posts/4");
		
		assertEquals(rs.statusCode(), 200);
	}

}
