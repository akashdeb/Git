package LocatorRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndName {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
//		WebElement textbox = driver.findElement(By.tagName("textarea"));
//		System.out.println(textbox);
//		
//		textbox.sendKeys("Selenium");
		
		WebElement gmailLink = driver.findElement(By.partialLinkText("Gma"));
		gmailLink.click();
	}

}