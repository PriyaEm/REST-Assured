package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;



public class putExamples {
	
	@Test
	public void testPut() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Priya");
		request.put("job", "QA");
		
		baseURI = "https://reqres.in/";
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		put("/api/users/2").
		then().
		statusCode(200);	
		
	}

}
