package collection;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class put {
	
	@Test
	public static void tc4() {
		RestAssured.baseURI="http://localhost:3000";
		
	Response rs=	given().contentType(ContentType.JSON).body("{\n"
			+ "    \"id\":\"4\",\n"
			+ "    \"title\":\"four4\",\n"
			+ "    \"author\":\"fouraut4\"\n"
			+ "\n"
			+ "}").when().put("/posts/4");
		
		assertEquals(rs.statusCode(), 200);
	}

}
