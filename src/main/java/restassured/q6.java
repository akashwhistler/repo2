package restassured;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class q6 {
	 @Test
	 public void test_updateUser() {
	  RestAssured.useRelaxedHTTPSValidation();
	  JSONObject request = new JSONObject();
	  request.put("name","kamal");
	  request.put("job","TestEngineer");
	  System.out.println(request.toString());
	  baseURI ="https://reqres.in";
	  given().
	   //header("Content-Type","application/json").
	   body(request.toString()).
	  when(). 
	   put("/api/users/2").
	  then().
	   statusCode(200).
	   log().all();
	}

}
