package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyButtonIsEnabledOrNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("akashdeb@gmail.com");
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//button[@data-continue-to=\"password-container\"]"));
		boolean enabled = button.isEnabled();
		
		if(enabled) {
			System.out.println("Pass: the button is enabled");
		}
		
		else
			System.out.println("Fail: the button is not enabled");

	}

}
