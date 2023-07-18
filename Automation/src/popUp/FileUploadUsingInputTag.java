package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingInputTag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://fineuploader.com/demos.html");
		
		driver.findElement(By.xpath("//input[@name=\"qqfile\"]")).sendKeys("C:\\Users\\AkashDeb\\eclipse-workspace_Automation1130May\\Automation\\resources\\DemoTest.png");
	}

}
