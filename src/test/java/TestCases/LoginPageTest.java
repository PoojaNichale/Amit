package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Page.LoginPage;

public class LoginPageTest extends Testbase {

	LoginPage page;
	
	@BeforeMethod
	public void setup() throws Exception {
	initialization();
	 page = new LoginPage();
	}
	
	
	@Test(dependsOnMethods="verifylogintextTest")
	public void loginzerodhaTest() throws Exception {
		
		page.loginzerodha();
}
	
	//@Test(enabled=false)
	@Test(invocationCount=3)
	public void verifykitelogotest() {
		
		page.verifykitelogo();
	}
	
	//@Test(priority=0)
	@Test(timeOut=1000)
	public void verifylogintextTest() {
		
		String a = page.verifylogintext();
		System.out.println(a);
	}
	
	@Test(priority=1)
	public void verifysharebyoption() throws Exception 
	{
		page.loginzerodha();
		Thread.sleep(3000);
		page.verifysharebyoption();
	}
	
	@AfterMethod
	public void end() {
		
		driver.close();
	}
	
	
	
}