package test01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutMethod 
{
	@Test
	public void putMethod()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		String b="{\r\n"
				+ "    \"name\": \"morheus\",\r\n"
				+ "    \"job\": \"zionresident\"\r\n"
				+ "}";
		RestAssured.given().body(b)
		        
		          .put().then()
		          .log()
		          .all()
		          .assertThat()
		          .statusCode(200);
	}

}
