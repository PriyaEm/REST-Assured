package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class patchExamples {
	
	@Test
	public void testPatch() {
		
		JSONObject request= new JSONObject();
		request.put("name", "RESTAsured");
		request.put("job", "Library");
		
		baseURI = "https://reqres.in";
		
		
		given().
			body(request.toJSONString()).
		when().
			patch("/api/users/2").
		then().
			statusCode(200);
		
		
		
	}

}
