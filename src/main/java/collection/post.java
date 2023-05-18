package collection;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class post {
	@Test
	public static void tc2() {
		RestAssured.baseURI="http://localhost:3000";
		
	Response res=given().contentType(ContentType.JSON).body(" {\n"
			+ "        \"id\": 3,\n"
			+ "        \"title\": \"three\",\n"
			+ "        \"author\": \"dharshan\"\n"
			+ "    }").when().post("/posts");
		
		assertEquals(res.statusCode(),201);
	
	}

}
