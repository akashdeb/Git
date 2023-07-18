package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test(priority = 1)
	public void login() {
		Assert.fail();
		System.out.println("Login to the application");
	}
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void verifyHomePage() {
		System.out.println("Home page is verified");
	}
	
	@Test(priority = 3)
	public void logout() {
		System.out.println("Logout from the application");
	}

}
