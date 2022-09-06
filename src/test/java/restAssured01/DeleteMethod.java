package restAssured01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteMethod 
{
	@Test
	public void deleteMethod()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		String a="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		RestAssured.given().body(a).delete()
		 .then()
		 .log()
		 .all()
		 .assertThat()
		 .statusCode(204);
		    
	}

}
