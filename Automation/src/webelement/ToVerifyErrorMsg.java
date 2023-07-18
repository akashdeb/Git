package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Scenario: Check For Error msg
//
//1. Launch the browser                                          Chrome
//2. Nav to URL                                   https://demo.actitime.com/login.do
//3. click Login Button
//4. Verify Whether error msg is coming or not  Username or Password is invalid. Please try again.
//


public class ToVerifyErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		String expectedErrorMsg = "Username or Password is invalid";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
		String actualErrorMsg = driver.findElement(By.className("errormsg")).getText();
		
		if(actualErrorMsg.contains(expectedErrorMsg)) {
			System.out.println("Pass: The error msg is verified");
		}
		
		else
			System.out.println("Fail: The error msg is not verified");

	}

}
