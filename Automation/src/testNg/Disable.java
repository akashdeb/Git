package testNg;

import org.testng.annotations.Test;

public class Disable {
	
	@Test(priority = 1)
	public void login() {
		System.out.println("Login to the application");
	}
	
	@Test(priority = 2, enabled = false)
	public void verifyHomePage() {
		System.out.println("Home page is verified");
	}
	
	@Test(priority = 3)
	public void logout() {
		System.out.println("Logout from the application");
	}

}
