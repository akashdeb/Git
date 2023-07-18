package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("https://demo.actitime.com/login.do");
		
		 WebElement usernameTextField = driver.findElement(By.id("username"));
		 WebElement passwordTextField=driver.findElement(By.name("pwd"));
		 WebElement loginButton=driver.findElement(By.xpath("//div[text()='Login ']"));
		 
		 String usernameTagname = usernameTextField.getTagName();
		 String passwordTagname = passwordTextField.getTagName();
		 String loginButtonTagname = loginButton.getTagName();

		 if(usernameTagname.equals("input") && passwordTagname.equals("input") && loginButtonTagname.equals("div")) {
			 usernameTextField.sendKeys("admin");
			 passwordTextField.sendKeys("manager");
			 loginButton.click();
		 }
		 
		 else
			 System.out.println("One of the tag names are not proper");
		

	}

}
