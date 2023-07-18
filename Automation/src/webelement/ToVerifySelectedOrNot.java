package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySelectedOrNot {

	public static void main(String[] args) {

		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		checkbox.click();
		
		if(checkbox.isSelected()) {
			System.out.println("Pass: the check box is selected");
		}
		
		else
			System.out.println("Fail: the checkbox is not selected");
		
		
	}

}
