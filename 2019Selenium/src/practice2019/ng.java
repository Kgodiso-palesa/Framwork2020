package practice2019;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ng {

	
	@BeforeMethod
	public void BforeMet()
	
	
	{
	
		System.out.println("Before test case execution");	
		
	}
	
	
	@AfterMethod
	
	public void AftrMeth()
	
	{
		System.out.println("After test case execution");		
	}
	
	@Test(priority = 2)
	
	public void FirstTestCase()
	
	{
		
	System.out.println("my first test case --1");	
	
	}
	
	@Test(priority =1 )
	public void SecondTestcase()
	
	{
		System.out.println("my second test case --2 ");	
		
	}

}
