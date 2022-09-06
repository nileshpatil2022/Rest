package test01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethod
{
	@Test
	public void getMethod()
	{
		
		Response r=RestAssured.get("https://reqres.in/api/users?page=2");
	  System.out.println(r.body().asString());
	  System.out.println(r.statusCode());
	}

}
