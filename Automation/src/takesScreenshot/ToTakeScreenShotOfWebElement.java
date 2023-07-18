package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		File source = driver.findElement(By.xpath("//*[name()='svg']")).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\AkashDeb\\eclipse-workspace_Automation1130May\\Automation\\screenshot\\elementShot.png");

		Files.copy(source, destination);
	}

}
