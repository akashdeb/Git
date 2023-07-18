package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTitle {

	public static void main(String[] args) {
		//test Data
		String expectedResult = "Google";
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//nav to the URL
		driver.get("https://www.google.co.in/");
		//fetching the title 
		String actualResult = driver.getTitle();
		//verifying the title
		if(actualResult.contains(expectedResult)) {
			System.out.println("Pass: the title is verified");
		}
		
		else
			System.out.println("Fail: the title is not verified");
			

	}

}
