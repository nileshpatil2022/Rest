package test01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteMethod 
{
	@Test
	public void deletemethod()
	{
	 
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		RestAssured.delete().then().assertThat().statusCode(204);
	}

}
