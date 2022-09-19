package TestClass;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG
{

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	@Test
	public void testA()
	{
	
		System.out.println("testA");
		System.out.println("Hi");
	}
	
	@Test
	public void testB()
	{
		System.out.println("testB");
	}
	
	@Test
	public void testC()
	{
		System.out.println("testC");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	
	
}
