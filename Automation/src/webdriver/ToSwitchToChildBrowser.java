package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// navigate to the url
		driver.get("https://demo.actitime.com/login.do");
		
		String parentWindowID = driver.getWindowHandle(); //parentID = 11AB
		
		//click on the link
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allIDs = driver.getWindowHandles(); //allID = [11AB, AE60]
		
		for(String id:allIDs) {  //id= AE60
			driver.switchTo().window(id);
			
			if(!id.equals(parentWindowID)) {
				Thread.sleep(5000);
				driver.quit();
			}
		}
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
