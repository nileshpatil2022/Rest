package testNG;

import org.testng.annotations.Test;

public class TestCase01 
{
	@Test
	public void m1()
	{
		System.out.println("test 01");
	}
    
	@Test(groups= {"my test"})
	public void m2()
	{
		System.out.println("test 02");
	}

	@Test(groups= {"my test"})
	public void m3()
	{
		System.out.println("test 03");
	}
	
	@Test
	public void m4()
	{
		System.out.println("test 04");
	}

}
