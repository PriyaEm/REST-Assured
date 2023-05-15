package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GET_Request {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://bookstore.toolsqa.com";
		
		RequestSpecification httpsRequest = RestAssured.given();
		
		Response response = httpsRequest.request(Method.GET, "/Bookstore/v1/Books");
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(200, statusCode);
		
//		System.out.println("Response status code is " + statusCode);		
//		
		Headers header = response.headers();
		int countOfHeaders = header.asList().size();
		Assert.assertEquals(7, countOfHeaders);
		
		String headerValue = response.getHeader("Content-Type");
		Assert.assertEquals("application/json; charset=utf-8", headerValue);
		
//		System.out.println("Headers of the response are " + header);
//		
		String responsebody = response.getBody().asString();
		Assert.assertTrue(responsebody.contains("Git Pocket Guide"));
		
//		
//		System.out.println("The Response body is " + responsebody.asString());
//		
//		responsebody.prettyPrint();
		
	}

}
