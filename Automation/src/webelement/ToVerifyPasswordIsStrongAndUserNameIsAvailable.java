package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyPasswordIsStrongAndUserNameIsAvailable {

	public static void main(String[] args) throws InterruptedException {
		String expectedUsernameMsg = "kuchUniqueLikhoSir";
		String password = "Strong";
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to the URL
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		
		//Pass value to the email
		driver.findElement(By.id("email")).sendKeys("akashdeb@gmail.com");
		Thread.sleep(2000);
		//click on continue button
		driver.findElement(By.xpath("//button[@data-continue-to='password-container']")).click();
		//pass value to password 
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		//Checking the password is Strong or not
		String msgForStrongPassword = driver.findElement(By.xpath("//p[contains(@class, 'password-validity-summary password-validity-summary')]")).getText();
	
		if(msgForStrongPassword.contains("strong")) {
			System.out.println("Pass: the Password is Strong");
			Thread.sleep(2000);
			//Click on the continue button
			driver.findElement(By.xpath("//button[@data-continue-to=\"username-container\"]")).click();
			Thread.sleep(3000);
			//Pass value to usrename 
			driver.findElement(By.id("login")).sendKeys(expectedUsernameMsg);
			Thread.sleep(3000);
			//Checking whether username is available or not
			String actualUsernameMsg = driver.findElement(By.id("login-err")).getText();
			
			if(actualUsernameMsg.equals(expectedUsernameMsg+" is available.")) {
				System.out.println("Pass the the Username is available");
			}
			else
				System.out.println("Fail: the username is not available");
		}
		
		else
			System.out.println("Fail : the password is not Strong");
	}

}
