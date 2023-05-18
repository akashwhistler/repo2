package restassured;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class q3 {
	
	@Test
	 public void test_deleteUser() {
	  RestAssured.useRelaxedHTTPSValidation();
	  
	  baseURI ="https://reqres.in";
	  
	given().when().delete("/api/users/2").
	  then().
	   statusCode(204).
	   log().all();
	}

}
