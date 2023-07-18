package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentIssues {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("file:///C:/Users/AkashDeb/Desktop/Allign.html");
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		
		Point usernameLocation = username.getLocation();
		int usernameStartX = usernameLocation.getX();
		
		int usernameWidth = username.getSize().getWidth();
		
		int usernameEndX = usernameStartX+usernameWidth;
		
		Point passwordLocation = password.getLocation();
		int passwordStartX = passwordLocation.getX();
		
		int passwordWidth = password.getSize().getWidth();
		
		int passwordEndX = passwordStartX+passwordWidth;
		
		if(usernameEndX == passwordEndX && usernameStartX == passwordStartX) {
			System.out.println("Pass: the textfieds are alligned");
		}
		
		else
			System.out.println("Fail: the textfieds are not alligned");

		driver.quit();
		
	}

}
