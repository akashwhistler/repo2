package restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;

public class q1 {
	@Test
	 public void test_updateUser() {
	  RestAssured.useRelaxedHTTPSValidation();
	  JsonObject request = new JsonObject();
	  request.addProperty("name","kamal");
	  request.addProperty("job","TestEngineer");
	  System.out.println(request.toString());
	  baseURI ="https://reqres.in";
	  given().
	   header("Content-Type","application/json").
	   body(request.toString()).
	  when(). 
	   put("/api/users/2").
	  then().
	   statusCode(200).
	   log().all();
	}

}
