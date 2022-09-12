package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Page.Dashboard;
import Page.LoginPage;

public class dashboardTest extends Testbase{

	Dashboard homepage;
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		 homepage = new Dashboard();
		 login = new LoginPage();
		 login.loginzerodha();
	}
	
	
	@Test
	public void verifydashboardkitelogoTest() throws Exception {
		Thread.sleep(3000);
		homepage.verifydashboardkitelogo();
	}
	
	@Test
	public void verifynicknametextTest() throws Exception {
	Thread.sleep(3000);
	homepage.verifynicknametext();
}
	
	@Test
	public void verifyprofileoptionsTest() throws Exception {
		Thread.sleep(3000);
		homepage.verifyprofileoptions();
	}
	
	@AfterMethod
	public void end() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}