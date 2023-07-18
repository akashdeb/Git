package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class toVerifyPageSource {
//	S.No   Test Step             Testdata                    ExpectedData
//	1.  Launch the browser       Chrome
//	2.  Navigate to the URL      https://www.google.com
//	3.  To verify the country name 
//		is coming or not                                     India
//  4.  Close the Browser
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		String sourceCode = driver.getPageSource();
		
		//System.out.println(sourceCode);
		
		if(sourceCode.contains("India")) {
			System.out.println("Pass: the Country name is present");
		}
		
		else
			System.out.println("Fail: the Country name is not present");

		driver.quit();

	}

}
