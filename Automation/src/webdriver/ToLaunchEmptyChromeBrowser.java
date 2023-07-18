package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchEmptyChromeBrowser {

	public static void main(String[] args) {
		String expectedResult = "https://www.google.co.in/";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		String actualResult = driver.getCurrentUrl();
		System.out.println("The Actual URL is : "+actualResult);
		
		if(actualResult.contains(expectedResult)) {
			System.out.println("Pass: the url is verified");
		}        
		else
			System.out.println("Fail: the url is not verified");

	}

}
