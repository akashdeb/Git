package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToParent {

	public static void main(String[] args) {
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// navigate to the url
		driver.get("https://demo.actitime.com/login.do");

		String parentWindowID = driver.getWindowHandle(); // parentID = 11AB

		// click on the link
		driver.findElement(By.linkText("actiTIME Inc.")).click();

		Set<String> allIDs = driver.getWindowHandles(); // allID = [11AB, AE60]
		
		for(String id:allIDs) {
			driver.switchTo().window(id);
			
			if(!id.equals(parentWindowID)) {
				
				String childBrowserTitle = driver.getTitle();
				System.out.println("The child browser title is : "+childBrowserTitle);
			}
			
		}
		
		driver.switchTo().window(parentWindowID);      
		String parentBrowserTitle = driver.getTitle();
		System.out.println("The Parent browser title is : "+parentBrowserTitle);

	}

}
