package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllIds {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//navigate to the url
		driver.get("https://demo.actitime.com/login.do");
		//click on the link
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		//fetch all window ids
		Set<String> allIds = driver.getWindowHandles();
		//printing the set<string>
		System.out.println(allIds);
		//Print each ids separately
		for(String id:allIds) {
			System.out.println(id);
		}

	}

}
