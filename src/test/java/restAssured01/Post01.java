package restAssured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Post01 
{   @Test
	public void m1()
	{
		RestAssured.baseURI="https://reqres.in/api/users";
		
		
		String a="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		
		RestAssured.given().body(a)
		           .post().then()
		           .log().all()
		           .assertThat()
		           .statusCode(201);
	}

}
