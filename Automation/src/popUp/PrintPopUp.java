package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class PrintPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException, FindFailed {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/AkashDeb/Desktop/print.html");
		
		//Robot robot=new Robot();
		
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_P);
//		
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_P);

		
		
		driver.findElement(By.tagName("button")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern filename = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Automation1130May\\Automation\\resources\\FileName.png");

		Pattern savebutton = new Pattern("C:\\Users\\AkashDeb\\eclipse-workspace_Automation1130May\\Automation\\resources\\SaveButton.png");

		Screen screen=new Screen();
		screen.wait(filename, 20);
		screen.type(filename, "DemoPrint123456753");
		screen.click(savebutton);
		
	}

}
