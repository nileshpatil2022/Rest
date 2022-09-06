package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo03 
{  
	
	@Test
	public void m1()
	{
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		String body="{\r\n"
				+ "    \"name\": \"nilesh\",\r\n"
				+ "    \"job\": \"java0123\"\r\n"
				+ "}";
		
		RestAssured.given().body(body)
		.post()
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(201);
		

		
	}

}
