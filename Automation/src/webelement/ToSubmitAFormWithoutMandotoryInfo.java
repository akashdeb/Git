package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSubmitAFormWithoutMandotoryInfo {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).submit();
		Thread.sleep(2000);
		WebElement errorMsg = driver.findElement(By.xpath("(//i[@class='_5dbc img sp_wMkcN9uIsOh sx_9529be'])[2]"));
		
		if(errorMsg.isDisplayed()) {
			System.out.println("The Form is not Submitted");
		}
		else
			System.out.println("The form is submitted");
	}

}
