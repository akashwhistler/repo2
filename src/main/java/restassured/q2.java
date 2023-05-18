package restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;

public class q2 {
	 @Test
	 public void test_patchUser() {
	  RestAssured.useRelaxedHTTPSValidation();
	  JSONObject request = new JSONObject();
	  request.put("name","kamal");
	  request.put("job","Tester");
	  System.out.println(request.toString());
	  baseURI ="https://reqres.in";
	  given().
	   //header("Content-Type","application/json").
	   body(request.toString()).
	  when(). 
	   patch("/api/users/2").
	  then().
	   statusCode(200).
	   log().all();
	}

}
