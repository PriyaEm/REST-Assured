package tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;


public class postExamples {
	
	@Test
	public void testPost() {
		
		baseURI = "https://reqres.in/api";
		JSONObject request = new JSONObject();
		request.put("name", "Priya");
		request.put("job", "QA");
		
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).			
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).
			log().all();
		
			}
	

}
