package collection;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class delect {
	@org.testng.annotations.Test
	public static void tc3() {
		RestAssured.baseURI="http://localhost:3000";
		
		Response rs=given().delete("posts/5");
		assertEquals(rs.statusCode(),200 );
	}
}
