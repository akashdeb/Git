package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifySearchQuerryIsCorrectOrNot {

	public static void main(String[] args) {
		String expectedQuerry = "BMW India";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement textField = driver.findElement(By.name("q"));
		
		textField.sendKeys("BMW India");
		textField.sendKeys(Keys.ENTER);
		
		String sourceCode = driver.getPageSource();
		
		if(sourceCode.contains(expectedQuerry)) {
			System.out.println("Pass: the search querry is verified");
		}
		
		else
			System.out.println("Fail: the search querry is not verified");

		
		
	}

}
