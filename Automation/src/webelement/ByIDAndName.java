package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIDAndName {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/demoPage.html");
		
		WebElement usernameTextfield = driver.findElement(By.id("1234"));
		
		System.out.println(usernameTextfield);
		
		usernameTextfield.sendKeys("pathar marunga");
		
		WebElement passwordTextField = driver.findElement(By.name("akash"));
		
		passwordTextField.sendKeys("police pakdegi");
	}

}
