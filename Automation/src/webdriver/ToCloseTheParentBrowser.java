package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseTheParentBrowser {

	// 1. Launch the browser
	//	2. Nav to url
	//	3. click on the link
	//	4. close the parent browser
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(5000);
		driver.close();

		// To close all browser
		// driver.quit();

	}

}
