package restAssured01;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethod 
{
     @Test
	public void getMethod()
	 {
    	Response r= RestAssured.get("https://reqres.in/api/users?page=2");
		
    	System.out.println(r.getBody().asString());
    	
    	System.out.println(r.getStatusCode());
    	
    	
    	 int actual=r.getStatusCode();
    	
    	 int expect=200;
    	 
    	 Assert.assertEquals(actual, expect);
    	
    	
    	
    	
    	
    	
    	 	
	 }
}
