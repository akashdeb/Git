package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginUsingEnterButton {

	public static void main(String[] args) throws InterruptedException {
		
		String expectedTitle = "actiTIME - Enter Time-Track";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		
		username.sendKeys("admin");
		password.sendKeys("manager");
		password.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: The home page has been verified");
		}
		else
			System.out.println("Fail: The home page has not been verified");

		
		
	}

}
