package rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo02 
{    @Test
	public void m1()
	{
	 Response s=RestAssured.get("https://reqres.in/api/users?page=2");
		
	 System.out.println(s.getStatusCode());
	 
	 System.out.println(s.getBody().asString());
	}

}
