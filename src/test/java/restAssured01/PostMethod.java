package restAssured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostMethod 
{   @Test
	public void postMethod()
	{
	  RestAssured.baseURI="https://reqres.in/api/users";
	  
	  String a="{\r\n"
	  		+ "    \"name\": \"mor\",\r\n"
	  		+ "    \"job\": \"lea\"\r\n"
	  		+ "}";
	  
	  RestAssured.given().body(a)
	  
	       .post().then()
	       .log().all()
	       .assertThat()
	       .statusCode(201);
		
	}

}
