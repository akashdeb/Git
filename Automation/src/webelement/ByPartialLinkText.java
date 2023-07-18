package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/demoPage.html");
		/**
		 * When to use partial link text?
		 * if the link text is too long
		 * if the link text is dynamic
		 * if unbreakable space is there
		 */
		WebElement linkText = driver.findElement(By.partialLinkText("Goto Selenium"));
		
		linkText.click();
	}

}
