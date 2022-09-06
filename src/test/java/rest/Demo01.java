package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo01 
{
    @Test
	public void m1()
	{
     RestAssured.baseURI="https://reqres.in/api/users";
		
		RestAssured.given().body("{\r\n"
				+ "    \"name\": \"java\",\r\n"
				+ "    \"job\": \"selenium\"\r\n"
				+ "}").post().then()
		.log()
		.all()
		.assertThat()
		.statusCode(201);
		
	}
}
