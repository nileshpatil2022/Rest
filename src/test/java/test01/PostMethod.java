package test01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostMethod 
{   
	
	@Test
	public void postMethod()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		String b="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		RestAssured.given().body(b).post().then()
		            .log().all().assertThat().statusCode(201);
		
	}

}
