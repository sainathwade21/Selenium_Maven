package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelpingAttributes {

	@Test(priority = -3)
	public void method1()
	{
		System.out.println("method1");
	}
	
	@Test(priority = 1)
	public void method2()
	{
		System.out.println("method2");
	}
	
	@Test(enabled = false)
	public void method3()
	{
		System.out.println("method3");
	}
	
	@Test(invocationCount = 5)
	public void method4()
	{
		Reporter.log("method4",true);
	}
	
	@Test(dependsOnMethods = "method4")
	public void method5()
	{
		Reporter.log("method5",true);
	}
	
	@Test(description = "Description of method6")
	public void method6()
	{
		Reporter.log("method6",true);
	}
	
	
	
}
