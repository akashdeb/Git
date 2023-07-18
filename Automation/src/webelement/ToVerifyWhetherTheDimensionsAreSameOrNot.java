package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyWhetherTheDimensionsAreSameOrNot {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("file:///C:/Users/AkashDeb/Desktop/Allign.html");
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		
		Dimension usernameDim = username.getSize();
		int usernameHeight = usernameDim.getHeight();
		int usernameWidth = usernameDim.getWidth();
		
		Dimension passwordDim = password.getSize();
		int passwordHeight = passwordDim.getHeight();
		int passwordWidth = passwordDim.getWidth();
		
		if(usernameHeight==passwordHeight && usernameWidth==passwordWidth) {
			System.out.println("Pass: The Dimensions are verified");
		}
		
		else
			System.out.println("Fail: The Dimensions are not verified");

		
		driver.quit();

		
		

	}

}
