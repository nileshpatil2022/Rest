package restAssured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutMethod 
{   @Test
	public void putMethod()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		String a="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		
		RestAssured.given().body(a)
		  .put()
		  .then()
		  .log()
		  .all()
		  .assertThat()
		  .statusCode(200);
		  
	}

}
