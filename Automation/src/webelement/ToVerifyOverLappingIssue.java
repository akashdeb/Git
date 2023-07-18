package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverLappingIssue {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/Allign.html");
		
		Rectangle passwordRect = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).getRect();
		Rectangle submitRect = driver.findElement(By.xpath("//button[text()='Submit']")).getRect();
		
		int passwordEndY = passwordRect.getY() + passwordRect.getHeight();
		int submitStartY = submitRect.getY();
		
		if(passwordEndY<=submitStartY) {
			System.out.println("Pass: the overlapping is verified");
		}

		else
			System.out.println("Fail: the overlapping is not verified");


	}

}
