package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutMethod 
{
     @Test
	public void m1()
	{
    	 RestAssured.baseURI="https://reqres.in/api/users/2";
    	 
    	 String a="{\r\n"
    	 		+ "    \"name\": \"morpheus\",\r\n"
    	 		+ "    \"job\": \"zon resident\"\r\n"
    	 		+ "}";
    	 
    	 RestAssured.given().body(a)
		
    	        .delete().then()
    	        .log().all()
    	        .assertThat()
    	        .statusCode(204);
    	 
    	 
    	 
    	 
    	 
	}
}
