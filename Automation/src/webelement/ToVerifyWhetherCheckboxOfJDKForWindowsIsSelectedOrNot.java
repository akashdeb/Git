package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyWhetherCheckboxOfJDKForWindowsIsSelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Navigate to the URL
		driver.get("https://www.google.co.in/");
		
		 WebElement textField = driver.findElement(By.name("q"));
		 textField.sendKeys("download jdk 1.8");
		 textField.sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.xpath("//h3[text()='Java SE 8 Archive Downloads (JDK 8u202 and earlier)']")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[text()=' jdk-8u202-windows-x64.exe']")).click();
		 
		 Thread.sleep(2000);

		 WebElement checkbox = driver.findElement(By.xpath("//input[@placeholder=\" \"]"));
		
		 checkbox.click();
		 if(checkbox.isSelected()) {
			 driver.findElement(By.xpath("//a[text()='Download jdk-8u202-windows-x64.exe']")).click();
		 }
		 else
			 System.out.println("The Checkbox is not selected");
	}

}
