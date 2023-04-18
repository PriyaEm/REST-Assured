package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class deleteExamples {
	
	@Test
	public void testDelete() {
		
		baseURI ="https://reqres.in";
		
		when().
			delete("/api/users/2").
		then().
			statusCode(204);		
		
		
	}

}
