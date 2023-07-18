package runtimePolymorphism;

import org.openqa.selenium.WebDriver;

public class ToVerifyGoogleTitle {
	//1. Navigate to Google
	//2. Verify the title of Google
	//3. Close the browser
	public static void test(WebDriver driver) {
		
		driver.get("https://www.google.co.in/");
		String actualTitle = driver.getTitle();
		
		if(actualTitle.contains("Google")) {
			System.out.println("Pass: the title is verified");
		}
		else
			System.out.println("Fail: the title is not verified");
		
		driver.quit();

	}

}
