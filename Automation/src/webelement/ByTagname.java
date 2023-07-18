package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagname {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AkashDeb/Desktop/demoPage.html");
		
		WebElement header = driver.findElement(By.tagName("h1"));
		
		String welcome = header.getText();
		
		System.out.println(welcome);
		
		if(welcome.equalsIgnoreCase("welcome!!")) {
			System.out.println("Pass: the header text is verified");
		}
		
		else
			System.out.println("Fail: the header text is not verified");

	}

}
